import classes.base.Herbivore;
import classes.base.Island;
import classes.base.Plant;
import classes.base.Predator;
import classes.location.Cell;
import classes.plants.PlantGowth;
import classes.predators.Wolf;
import classes.utils.LiveSimulator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Island island = LiveSimulator.createIslandAndLive();
        System.out.println(Predator.getStaticInstances().size());
        System.out.println(Herbivore.getStaticInstances().size());

        PlantGowth.plantGrowth();
        System.out.println(Plant.getStaticInstances().size());

        int z = 0;
        while (Predator.getStaticInstances().size()>0 && Herbivore.getStaticInstances().size()>0 ) {
            LiveSimulator.predatorsLive(Predator.getStaticInstances()); // в первый прогон все сыты
            LiveSimulator.predatorsLive(Herbivore.getStaticInstances()); // в первый прогон все сыты

            System.out.println(Predator.getStaticInstances().size());
            System.out.println(Herbivore.getStaticInstances().size());
            System.out.println(Plant.getStaticInstances().size());
            System.out.println("Такт симуляции номер: " + ++z);
        }




//        for (ArrayList<Cell> i : island.grid){
//            for (Cell k : i){
//                System.out.print(k.getCoords()+", ");
//                System.out.println(k.spisok);
//            }
//            System.out.println();
//        }
    }
}
