package classes.location;

import classes.base.Animal;

import java.util.ArrayList;

public class Cell {
    private ArrayList<Integer> coords; // Список для хранения координат
    public ArrayList<Animal> spisok = new ArrayList<>(); // Список для хранения животных

    public Cell(int x, int y) {
        this.coords = new ArrayList<>(); // Инициализация списка
        this.coords.add(x); // Добавляем координату X
        this.coords.add(y); // Добавляем координату Y
    }
    // Метод для получения координат
    public ArrayList<Integer> getCoords() {
        return coords;
    }
}