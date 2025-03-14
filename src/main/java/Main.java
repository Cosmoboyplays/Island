import classes.base.Herbivore;
import classes.base.Island;
import classes.base.Plant;
import classes.base.Predator;
import classes.location.Cell;
import classes.predators.Wolf;
import classes.utils.LiveSimulator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Island island = LiveSimulator.createIslandAndLive();

        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());
        LiveSimulator.predatorsLive(); // в первый прогон все сыты

        LiveSimulator.predatorsLive();
        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());

        LiveSimulator.predatorsLive();
        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());

        LiveSimulator.predatorsLive();
        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());

        LiveSimulator.predatorsLive();
        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());

        LiveSimulator.predatorsLive();
        System.out.println(Predator.getInstances().size());
        System.out.println(Herbivore.getInstances().size());




//        for (ArrayList<Cell> i : island.grid){
//            for (Cell k : i){
//                System.out.print(k.getCoords()+", ");
//                System.out.println(k.spisok);
//            }
//            System.out.println();
//        }
    }
}
