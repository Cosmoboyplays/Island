package classes.plants;

import classes.utils.Util;

public class PlantGowth {
    public static void plantGrowth() {
        int howManyPlants = 500;
        // Вызываем метод, но не сохраняем результат
        Util.createAnimals(howManyPlants, Grass.class);
        System.out.println("Вырастили растений");
    }
}

