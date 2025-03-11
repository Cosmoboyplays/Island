package classes.utils;

import java.util.ArrayList;

public class Util {
    public static <T> ArrayList<T> createAnimals(int amount, Class<T> clazz) {
        ArrayList<T> animals = new ArrayList<>();
        try {
            for (int i = 0; i < amount; i++) {
                // Создаем новый экземпляр класса
                animals.add(clazz.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Обработка исключений
        }
        return animals;
    }

}
