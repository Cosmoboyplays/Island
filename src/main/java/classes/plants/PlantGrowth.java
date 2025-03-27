package classes.plants;

import classes.base.Plant;
import classes.utils.Util;

import static classes.utils.LiveSimulator.island;

public class PlantGrowth extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        int howManyPlants = island.getGrowthPlan();
        int count = 0; // Счетчик для вывода
        while (running) {
            while (Plant.getStaticInstances().size() < 40000) {
                Util.createAnimals(howManyPlants, Grass.class);

                synchronized (System.out) {
                    System.out.println("__________Вырастили " + howManyPlants + " растений______________");
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void stopGrowing() {
        running = false; // Устанавливаем флаг в false для остановки потока
    }
}

