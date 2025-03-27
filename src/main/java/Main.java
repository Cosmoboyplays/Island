import classes.base.Herbivore;
import classes.base.Plant;
import classes.base.Predator;
import classes.plants.PlantGrowth;
import classes.utils.LiveSimulator;

public class Main {
    public static void main(String[] args) {
        LiveSimulator.createIslandAndLive();
        System.out.println(Predator.getStaticInstances().size());
        System.out.println(Herbivore.getStaticInstances().size());

        // поток роста растений
        PlantGrowth plantGrowthThread = new PlantGrowth();
        plantGrowthThread.start();

        int z = 0;
        while (Predator.getStaticInstances().size() > 0 && Herbivore.getStaticInstances().size() > 0) {
            LiveSimulator.predatorsLive(Predator.getStaticInstances()); // в первый прогон все сыты
            LiveSimulator.predatorsLive(Herbivore.getStaticInstances()); // в первый прогон все сыты
            synchronized (System.out) {
                System.out.println("Осталось хищных: " + Predator.getStaticInstances().size());
                System.out.println("Осталось тровоедов: " + Herbivore.getStaticInstances().size());
                System.out.println("Осталось растений: " + Plant.getStaticInstances().size());
                System.out.println("Такт симуляции номер: " + ++z);
                System.out.println();
            }
        }
        plantGrowthThread.stopGrowing();
    }
}
