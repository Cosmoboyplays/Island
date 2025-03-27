package classes.utils;

import classes.base.Animal;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import static classes.utils.LiveSimulator.island;

public class AnimalMovement {
    public static ArrayList<Integer> getPossibleCoordinates(ArrayList<Integer> coords, int islandWidth, int islandHeight, int movesPerCycle, int maxItemsPerCell, Class<?> iClass) {

        ArrayList<ArrayList<Integer>> possibleCoords = new ArrayList<>();
        int currentX = coords.get(0);
        int currentY = coords.get(1);

        // Проходим по всем возможным направлениям
        for (int dx = -movesPerCycle; dx <= movesPerCycle; dx++) {
            for (int dy = -movesPerCycle; dy <= movesPerCycle; dy++) {
                // Проверяем, что перемещение не превышает количество клеток, которые может пройти животное
                if (Math.abs(dx) + Math.abs(dy) <= movesPerCycle) {
                    int newX = currentX + dx;
                    int newY = currentY + dy;

                    // Проверяем, что новые координаты находятся в пределах острова и на этой клетке не максимум этого вида животных
                    if (newX >= 0 && newX <= islandWidth && newY >= 0 && newY <= islandHeight) {
                        CopyOnWriteArrayList<Animal> thisCell = island.grid.get(newX).get(newY).spisok; // реальный список клетки
                        int amount_i_in_cell = Util.checkAmount(thisCell, iClass);
                        // Проверяем что количество этого вида меньше максимально возможного количества этого вида на клетке
                        if (amount_i_in_cell< maxItemsPerCell){

                            // Добавляем новые координаты в список
                            ArrayList<Integer> newCoord = new ArrayList<>();
                            newCoord.add(newX);
                            newCoord.add(newY);
                            possibleCoords.add(newCoord);
                        }
                    }
                }
            }
        }
        return getNewRandomCoord(possibleCoords);
    }
    protected static ArrayList<Integer> getNewRandomCoord(ArrayList<ArrayList<Integer>> possibleCoords){
        // Проверяем, что список возможных координат не пуст
        if (possibleCoords.isEmpty()) {
            return null; // Или выбросьте исключение, если это необходимо
        }
        // Получаем случайный индекс
        int randomIndex = ThreadLocalRandom.current().nextInt(possibleCoords.size());
        // Возвращаем случайный список координат
        return possibleCoords.get(randomIndex);
    }
}
