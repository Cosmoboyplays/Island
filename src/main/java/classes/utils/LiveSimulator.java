package classes.utils;

import classes.base.Animal;
import classes.base.Herbivore;
import classes.base.Island;
import classes.base.Predator;
import classes.utils.ChanceToBeEatenConfig;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.reflect.Constructor;

import static classes.utils.AnimalMovement.getPossibleCoordinates;

public class LiveSimulator {
    public static Island island;

    public static Island createIslandAndLive() {
        System.out.println("Перед созданием симуляции нужно ввести параметры," +
                " но пока использую стандартные параметры, чтобы не заполнять при каждой проверке");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер острова(2 числа через пробел)");
//        String input = sc.nextLine();
//        String[] parts = input.split("\\s+");
//        int widht = Integer.parseInt(parts[0]); // Первое число в переменной w
//        int height = Integer.parseInt(parts[1]);
//
//        System.out.println("Введите количество хищников, травоядных, растений на острове(3 числа через пробел)");
//        String input2 = sc.nextLine();
//        String[] parts2 = input2.split("\\s+");
//        int howManyPredators = Integer.parseInt(parts2[0]); // Первое число в переменной w
//        int howManyHerbivores = Integer.parseInt(parts2[1]);
//        int howManyPlants = Integer.parseInt(parts2[2]);
//
//        System.out.println("Введите процент вычита жизненной силы");
//        int lossOfLife = Integer.parseInt(sc.nextLine());

        int widht = 90;
        int height = 20;
        int howManyPredators = 1150;
        int howManyHerbivores = 2830;
        int howManyPlants = 2000;
        int lossOfLife = 25;

        island = new Island(widht, height, lossOfLife, howManyPredators, howManyHerbivores, howManyPlants);
        island.createGrid();
        island.createLive();

        return island;
    }

    public static void predatorsLive(ArrayList<? extends Animal> animals) {
        long startTime = System.nanoTime();
        List<Animal> toIterate = new ArrayList<>(animals);
        for (Animal i : toIterate) { // перебираем животных и пробуем съесть всех кто на той же клетке нах и размножится и передвинуться


            Class<?> iClass = i.getClass();
            HashMap<String, Integer> mapPredator = ChanceToBeEatenConfig.getConfig().get(iClass.getName()); //получаем HashMap <травоядное, % успеха>
            ArrayList<Integer> coords = i.getCoords();
            ArrayList<Animal> thisCell = island.grid.get(coords.get(0)).get(coords.get(1)).spisok; // реальный список клетки
            ArrayList<Animal> spisokAnimalsInCelltoIterate = new ArrayList<>(thisCell); //список животных на ячейке вместе с конкретным животным


            for (Animal k : spisokAnimalsInCelltoIterate) {
                // едим
                if (mapPredator.containsKey(k.getClass().getName()) && i.getSatietyAmount() < 100) { // может быть ситуация, что не нужно дальше перебирать пока оставим так
                    int randomValue = ThreadLocalRandom.current().nextInt(0, 101);
                    int percent = mapPredator.get(k.getClass().getName());

                    if (randomValue <= percent) {
                        i.setSatietyAmount(i.getSatietyAmount() + (int) Math.round((k.getWeight() / i.getSaturationAmount() * 100))); // Увеличиваем насыщение хищника
//                        System.out.println(i + " съел " + k.getClass().getName());  // Съедаем травоядное
                        thisCell.remove(k); // удаляем с клетки еду которую съели
                        k.getInstances().remove(k); // удаляю из общего списка того класса к которому относится k
                    }
                }



                // размножаемся
                else if (k.getClass().getName().equals(iClass.getName())
                        && k.hashCode() != i.hashCode()
                        && i.getMultiplied()
                        && k.getMultiplied()) {
                    try {
                        int amount_i_in_cell = Util.checkAmount(thisCell, iClass);
                        if (i.getMaxItemsPerCell() > amount_i_in_cell) {
                            var reborn = k.getClass().getConstructor(ArrayList.class).newInstance(coords); //создаем животинку
                            //animals.add(reborn); //почему тут так не понял, но норма работает, когда замъючено
                            thisCell.add(reborn);
                            i.setMultiplied(false);
                            k.setMultiplied(false); // животные могут размножаться 1 раз за такт симуляции
                        }
                    } catch (ReflectiveOperationException e) {
                        throw new RuntimeException(e);
                    }
                }

            }

            // передвигаемся
            ArrayList<Integer> newCoord = getPossibleCoordinates(coords, island.width, island.height, i.getCellMovesPerCycle(), i.getMaxItemsPerCell(), iClass);
            i.setCoords(newCoord);
//            System.out.println(i + " с локации " + coords+ "переместилось на " + newCoord);


            // вычитаем жизненную силу этого животного и убиваем, если плохо кушает
            int liveOrDie = i.getSatietyAmount() - island.getLossOfLife();
            if (liveOrDie <= 0) {
//                   System.out.println(i+" погибло, УВЫ");
                island.grid.get(coords.get(0)).get(coords.get(1)).spisok.remove(i); // удаляем с грида
                animals.remove(i); // удаляем из основного списка животных
            }
            i.setSatietyAmount(liveOrDie);
            }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("Время выполнения: " + duration + " миллисекунд");
        }
    }


