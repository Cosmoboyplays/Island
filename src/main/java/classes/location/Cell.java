package classes.location;
import classes.base.Animal;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    private CopyOnWriteArrayList<Integer> coords; // Список для хранения координат
    public CopyOnWriteArrayList<Animal> spisok = new CopyOnWriteArrayList<Animal>(); // Список для хранения животных

    public Cell(int x, int y) {
        this.coords = new CopyOnWriteArrayList<>(); // Инициализация списка
        this.coords.add(x); // Добавляем координату X
        this.coords.add(y); // Добавляем координату Y
    }

    // Метод для получения координат
    public CopyOnWriteArrayList<Integer> getCoords() {
        synchronized (spisok) {
            return coords;
        }
    }
}