package classes.base;
import classes.predators.*;
import classes.location.Cell;
import classes.utils.Util;

import java.util.ArrayList;

public class Island {
    private int width;
    private int height;
    private int lossOfLife; // отнимаем этот процент насыщения каждый такт симуляции
    private int howManyPredators;
    private int howManyHerbivores;
    private int howManyPlants;
    public ArrayList<ArrayList<Cell>> grid = new ArrayList<>();

    // конструктор
    public Island(int width, int height, int lossOfLife, int howManyPredators, int howManyHerbivores, int howManyPlants) {
        this.width = width-1; // 100
        this.height = height-1; // 20
        this.lossOfLife = lossOfLife; // 25%
        this.howManyPredators = howManyPredators;
        this.howManyHerbivores = howManyHerbivores;
        this.howManyPlants = howManyPlants;
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
    public void createLive (int howManyPredators) {
        // процент каждого животного используя максимально возможное кол. конкретного вида на 1 клетке
        double maxBear = Bear.maxItemsPerCell;
        double maxWolf = Wolf.maxItemsPerCell;
        double maxSnake = Snake.maxItemsPerCell;
        double maxFox = Fox.maxItemsPerCell;
        double maxEagle = Eagle.maxItemsPerCell;

        double totalPredators = maxBear + maxWolf + maxSnake + maxFox + maxEagle;
        ArrayList<Animal> predators = new ArrayList<>();
        // количество каждого животного в процентном соотношении
        // количество животных может незначительно отличаться от заданного юзером, т.к расчет идет через проценты
        int bearCount = (int) Math.ceil((maxBear / totalPredators) * howManyPredators);
        int wolfCount = (int) Math.ceil((maxWolf / totalPredators) * howManyPredators);
        int snakeCount = (int) Math.ceil((maxSnake / totalPredators) * howManyPredators);
        int foxCount = (int) Math.ceil((maxFox / totalPredators) * howManyPredators);
        int eagleCount = (int) Math.ceil((maxEagle / totalPredators) * howManyPredators);

        predators.addAll(Util.createAnimals(bearCount, Bear.class));
        predators.addAll(Util.createAnimals(wolfCount, Wolf.class));
        predators.addAll(Util.createAnimals(snakeCount, Snake.class));
        predators.addAll(Util.createAnimals(foxCount, Fox.class));
        predators.addAll(Util.createAnimals(eagleCount, Eagle.class));
        // Выводим общее количество животных
        System.out.println("Общее количество животных: " + predators.size());

    }

}



//     System.out.println("Процент медведей: " + bearPercentage + "%");
//        System.out.println("Процент волков: " + wolfPercentage + "%");
//        System.out.println("Процент змей: " + snakePercentage + "%");
//        System.out.println("Процент лис: " + foxPercentage + "%");
//        System.out.println("Процент орлов: " + eaglePercentage + "%");