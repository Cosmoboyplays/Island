package classes.utils;

import classes.base.Animal;
import classes.base.Herbivore;
import classes.base.Island;
import classes.base.Predator;
import classes.utils.ChanceToBeEatenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LiveSimulator {
    public static Island island;

    public static Island createIslandAndLive(){
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

        int widht = 50;
        int height = 20;
        int howManyPredators = 115;
        int howManyHerbivores = 2230;
        int howManyPlants = 200;
        int lossOfLife = 25;

        island = new Island(widht, height, lossOfLife, howManyPredators, howManyHerbivores, howManyPlants);
        island.createGrid();
        island.createLive();

        return island;
    }

    public static void predatorsLive() {
        List<Animal> toRemove = new ArrayList<>(); //список для удаления тех, кто плохо кушает

        for (Predator i : Predator.getInstances()) { // перебираем животных и пробуем съесть всех кто на той же клетке находится и размножится и передвинуться
            HashMap<String, Integer> mapPredator = ChanceToBeEatenConfig.getConfig().get(i.getClass().getName()); //получаем HashMap <травоядное, % успеха>
            ArrayList<Integer> coords = i.getCoords();
            ArrayList<Animal> spisokAnimalsInCell = island.grid.get(coords.get(0)).get(coords.get(1)).spisok; //список животных на ячейке вместе с конкретным животным
            List<Animal> toRemove2 = new ArrayList<>();
            for (Animal k : spisokAnimalsInCell) {
                // едим
                if (mapPredator.containsKey(k.getClass().getName()) && i.getSatietyAmount()<100) { // может быть ситуация, что не нужно дальше перебирать пока оставим так
                    int randomValue = ThreadLocalRandom.current().nextInt(0, 101);
                    int percent = mapPredator.get(k.getClass().getName());

                    if (randomValue <= percent) {
                        i.setSatietyAmount(i.getSatietyAmount() + (int) Math.round((k.getWeight()/i.getSaturationAmount()*100))); // Увеличиваем насыщение хищника
                        System.out.println(i + " съел " + k.getClass().getSimpleName());    // Съедаем травоядное
                        toRemove2.add(k);
                    }
                }
                // размножаемся
                else if (k.getClass().getName().equals(i.getClass().getName()) && k.hashCode()!=i.hashCode()) {
                    System.out.println(k.getClass().getSimpleName()+ " размножаются ура");
                }
            }
            spisokAnimalsInCell.removeAll(toRemove2); // удаляем с клетки еду которую съели
            Herbivore.instances.removeAll(toRemove2); // удаляем из списка травоядных

            //передвигаемся






            // вычитаем жизненную силу этого животного и убиваем, если плохо кушает
            int liveOrDie = i.getSatietyAmount()-island.getLossOfLife();
            if (liveOrDie<=0) {
                island.grid.get(coords.get(0)).get(coords.get(1)).spisok.remove(i); // удаляем с грида
                toRemove.add(i);
            }
            i.setSatietyAmount(liveOrDie);
        }
        Predator.getInstances().removeAll(toRemove); // удаляем из основного списка животных





    }
}

