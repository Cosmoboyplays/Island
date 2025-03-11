import classes.base.Island;
import classes.location.Cell;
import classes.utils.LiveSimulator;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Island island = LiveSimulator.createIslandAndLive();

//        for (ArrayList<Cell> i : island.grid){
//            for (Cell k : i){
//                System.out.print(k.getCoords()+", ");
//            }
//            System.out.println();
//        }
    }
}
