package classes.base;
import classes.predators.*;
import classes.herbivores.*;
import classes.plants.Grass;

import classes.location.Cell;
import classes.utils.Util;

import java.util.Arrays;
import java.util.Random;

import java.util.ArrayList;

public class Island {
    public int width;
    public int height;
    private int lossOfLife; // отнимаем этот процент насыщения каждый такт симуляции, если не
    private int howManyPredators;
    private int howManyHerbivores;
    private int howManyPlants;
    public ArrayList<ArrayList<Cell>> grid = new ArrayList<>();

    // конструктор
    public Island(int width, int height, int lossOfLife, int howManyPredators, int howManyHerbivores, int howManyPlants) {
        this.width = width-1; // 100 не
        this.height = height-1; // 20
        this.lossOfLife = lossOfLife; // 25%
        this.howManyPredators = howManyPredators;
        this.howManyHerbivores = howManyHerbivores;
        this.howManyPlants = howManyPlants;
    }
    public int getLossOfLife() {
        return lossOfLife;
    }

    // создаю сетку локаций в соответствии с заданными параметрами
    public void createGrid () {
        for (int i = 0; i <= this.width; i++) {
            grid.add(new ArrayList<>());
            for (int k = 0; k <= this.height; k++) {
                grid.get(i).add(new Cell(i, k));
            }
        }
    }


    // наполняю животными остров
    public void createLive () {
        // процент каждого животного используя максимально возможное кол. конкретного вида на 1 клетке
        // хищники
        double maxBear = Bear.maxItemsPerCell;
        double maxWolf = Wolf.maxItemsPerCell;
        double maxSnake = Snake.maxItemsPerCell;
        double maxFox = Fox.maxItemsPerCell;
        double maxEagle = Eagle.maxItemsPerCell;

        double totalPredsUtil = maxBear + maxWolf + maxSnake + maxFox + maxEagle;

        // количество каждого животного в % соотношении. может незначительно отличаться от заданного юзером, т.к расчет идет через проценты
        int bearCount = (int) Math.ceil((maxBear / totalPredsUtil) * howManyPredators);
        int wolfCount = (int) Math.ceil((maxWolf / totalPredsUtil) * howManyPredators);
        int snakeCount = (int) Math.ceil((maxSnake / totalPredsUtil) * howManyPredators);
        int foxCount = (int) Math.ceil((maxFox / totalPredsUtil) * howManyPredators);
        int eagleCount = (int) Math.ceil((maxEagle / totalPredsUtil) * howManyPredators);

        //--------------------------------------------------------------------------------------------------------------
        //траволюбы
        double maxBoar = Boar.maxItemsPerCell;
        double maxBuffalo = Buffalo.maxItemsPerCell;
        double maxCaterpillar = Caterpillar.maxItemsPerCell;
        double maxDeer = Deer.maxItemsPerCell;
        double maxDuck = Duck.maxItemsPerCell;
        double maxGoat = Goat.maxItemsPerCell;
        double maxHorse = Horse.maxItemsPerCell;
        double maxMouse = Mouse.maxItemsPerCell;
        double maxRabbit = Rabbit.maxItemsPerCell;
        double maxSheep = Sheep.maxItemsPerCell;

        double totalHerbsUtil = maxBoar + maxBuffalo + maxCaterpillar + maxDeer + maxDuck + maxGoat + maxHorse + maxMouse + maxRabbit + maxSheep;

        int BoarCount = (int) Math.ceil((maxBoar / totalHerbsUtil) * howManyHerbivores);
        int BuffaloCount = (int) Math.ceil((maxBuffalo / totalHerbsUtil) * howManyHerbivores);
        int CaterpillarCount = (int) Math.ceil((maxCaterpillar / totalHerbsUtil) * howManyHerbivores);
        int DeerCount = (int) Math.ceil((maxDeer / totalHerbsUtil) * howManyHerbivores);
        int DuckCount = (int) Math.ceil((maxDuck / totalHerbsUtil) * howManyHerbivores);
        int GoatCount = (int) Math.ceil((maxGoat / totalHerbsUtil) * howManyHerbivores);
        int HorseCount = (int) Math.ceil((maxHorse / totalHerbsUtil) * howManyHerbivores);
        int MouseCount = (int) Math.ceil((maxMouse / totalHerbsUtil) * howManyHerbivores);
        int RabbitCount = (int) Math.ceil((maxRabbit / totalHerbsUtil) * howManyHerbivores);
        int SheepCount = (int) Math.ceil((maxSheep / totalHerbsUtil) * howManyHerbivores);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.addAll(Util.createAnimals(wolfCount, Wolf.class));
        animals.addAll(Util.createAnimals(bearCount, Bear.class));
        animals.addAll(Util.createAnimals(snakeCount, Snake.class));
        animals.addAll(Util.createAnimals(foxCount, Fox.class));
        animals.addAll(Util.createAnimals(eagleCount, Eagle.class));

        animals.addAll(Util.createAnimals(BoarCount, Boar.class));
        animals.addAll(Util.createAnimals(BuffaloCount, Buffalo.class));
        animals.addAll(Util.createAnimals(CaterpillarCount, Caterpillar.class));
        animals.addAll(Util.createAnimals(DeerCount, Deer.class));
        animals.addAll(Util.createAnimals(DuckCount, Duck.class));
        animals.addAll(Util.createAnimals(GoatCount, Goat.class));
        animals.addAll(Util.createAnimals(HorseCount, Horse.class));
        animals.addAll(Util.createAnimals(MouseCount, Mouse.class));
        animals.addAll(Util.createAnimals(RabbitCount, Rabbit.class));
        animals.addAll(Util.createAnimals(SheepCount, Sheep.class));
        //добавление растений
        animals.addAll(Util.createAnimals(howManyPlants, Grass.class));

        // Выводим общее количество животных
        System.out.println("Общее количество животных и растений до циклов: " + animals.size());
        }

}









//        System.out.println("медведей: "+ bearCount);
//        System.out.println("волков:  "+ wolfCount);
//        System.out.println("змей:  "+ snakeCount);
//        System.out.println("лис: "+ foxCount);
//        System.out.println(" орлов: "+ foxCount);

//        System.out.println("BoarCount: "+ BoarCount);
//        System.out.println("BuffaloCount:  "+ BuffaloCount);
//        System.out.println("CaterpillarCount:  "+ CaterpillarCount);
//        System.out.println("DeerCount: "+ DeerCount);
//        System.out.println(" DuckCount: "+ DuckCount);
//        System.out.println(" GoatCount: "+ GoatCount);
//        System.out.println(" HorseCount: "+ HorseCount);
//        System.out.println(" MouseCount: "+ MouseCount);
//        System.out.println(" RabbitCount: "+ RabbitCount);
//        System.out.println(" SheepCount: "+ SheepCount);



// в теории код ниже оптимизирует метод createLive, но это потом
//// Определяем классы животных и их максимальные значения
//Class<? extends Animal>[] animalClasses = new Class[] {Bear.class, Wolf.class, Snake.class, Fox.class, Eagle.class};
//double[] maxItemsPerCell = new double[animalClasses.length];
//int[] animalCounts = new int[animalClasses.length];
//// Заполняем массивы максимальными значениями
//for (int j = 0; j < animalClasses.length; j++) {
//        try {
//maxItemsPerCell[j] = (double) animalClasses[j].getField("maxItemsPerCell").get(null);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//            }
//// Общая сумма максимальных значений
//double totalAnimalsUtil = 0;
//for (double max : maxItemsPerCell) {
//totalAnimalsUtil += max;
//}
//// Количество животных
//int howManyAnimals = howManyPredators;
//ArrayList<Animal> animals = new ArrayList<>();
//// Количество каждого животного в % соотношении
//for (int j = 0; j < animalClasses.length; j++) {
//animalCounts[j] = (int) Math.ceil((maxItemsPerCell[j] / totalAnimalsUtil) * howManyAnimals);
//        System.out.println(animalClasses[j].getSimpleName() + ": " + animalCounts[j]);
//        animals.addAll(Util.createAnimals(animalCounts[j], animalClasses[j]));
//        }
//// Выводим общее количество животных
//        System.out.println("Общее количество животных: " + animals.size());
//Random random = new Random();
//for (Animal animal : animals) {
//int x = random.nextInt(width + 1);
//int y = random.nextInt(height + 1);
//ArrayList<Animal> spisok = grid.get(x).get(y).spisok;
//Class<?> classToCount = animal.getClass();
//int amountInCell = Util.checkAmount(spisok, classToCount); // Сколько животных этого вида на данной клетке
//    if (animal.getMaxItemsPerCell() > amountInCell) {
//        spisok.add(animal);
//    }
//            }
