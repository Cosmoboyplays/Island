//package classes.base;
//
//import com.dudarev.island.classes.board.Board;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Printer implements Runnable {
//    Board board;
//    boolean start;
//
//    public Printer(Board board) {
//        this.board = board;
//    }
//
//    public void getStatistics() {
//        HashMap<String, ArrayList<? extends SimulationItem>> allAliveItemsMap = board.getAllAliveItemsMap();
//        ArrayList<Animal> predators = (ArrayList<Animal>) allAliveItemsMap.get("classes/predators");
//        ArrayList<Animal> herbivores = (ArrayList<Animal>) allAliveItemsMap.get("herbivores");
//        ArrayList<Plant> plants = (ArrayList<Plant>) allAliveItemsMap.get("plants");
//
//        if (!start) {
//            System.out.println("-------------------");
//            System.out.println("Thread printer - Start!, herbivores count: " + herbivores.size());
//            System.out.println("Thread printer - Start!, predators count: " + predators.size());
//            System.out.println("Thread printer - Start!, grass count: " + plants.size());
//            System.out.println("-------------------");
//            start = true;
//        }
//
//        System.out.println("-------------------");
//        System.out.println("Thread printer - herbivores count: " + herbivores.size());
//        System.out.println("Thread printer - predators count: " + predators.size());
//        System.out.println("Thread printer - plants count: " + plants.size());
//        System.out.println("-------------------");
//    }
//
//    @Override
//    public void run() {
//        getStatistics();
//    }
//}
