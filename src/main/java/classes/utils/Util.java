package classes.utils;

import classes.base.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import static classes.utils.LiveSimulator.island;


public class Util {

    //метод для создания нужного количества животных переданного класса
    public static <T> ArrayList<T> createAnimals(int amount, Class<T> clazz) {
        ArrayList<T> animals = new ArrayList<>();
        try {
            for (int i = 0; i < amount; i++) {
                // Создаем новый экземпляр класса
                animals.add(clazz.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // распределяем
        gridDistribution((ArrayList<Animal>) animals);
        return animals;
    }

    // метод для проверки сколько в клетке экземпляров переданного класса
    public static int checkAmount(CopyOnWriteArrayList spisok, Class<?> clazz) {
        int count = 0;
        for (Object obj : spisok) {
            if (clazz.isInstance(obj)) count++;
        }
        return count;
    }

    // метод - распределение животных по сетке
    public static void gridDistribution(ArrayList<Animal> animals) {
        Random randomwidth = new Random();
        Random randomheight = new Random();
        for (Animal i : animals) {
            int x = randomwidth.nextInt(island.width + 1);
            int y = randomheight.nextInt(island.height + 1);
            CopyOnWriteArrayList<Animal> spisok = island.grid.get(x).get(y).spisok;
            Class<?> classToCount = i.getClass();
            int amount_i_in_cell = Util.checkAmount(spisok, classToCount);//сколько животных этого вида на данной клетке

            if (i.getMaxItemsPerCell() > amount_i_in_cell) {
                i.setCoords(new ArrayList<>(Arrays.asList(x, y))); // у каждого животного есть координаты где оно сейчас
                spisok.add(i);

            }
        }
    }
}
