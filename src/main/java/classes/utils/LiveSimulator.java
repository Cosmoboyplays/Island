package classes.utils;

import classes.base.Island;

import java.util.Scanner;

public class LiveSimulator {

    public static Island createIslandAndLive(){
        System.out.println("Перед созданием симуляции нужно ввести параметры," +
                " но пока использую стандартные параметры, чтобы не запоолнять при каждой проверке");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размер острова(2 числа через пробел)");
//        String input = sc.nextLine();
//        String[] parts = input.split("\\s+");
//        int widht = Integer.parseInt(parts[0]); // Первое число в переменной w
//        int height = Integer.parseInt(parts[1]);
//
//        System.out.println("Введите количество хищников, травоядных, растений на острове(3 числа через пробел)");
//        String input2 = sc.nextLine();
//        String[] parts2 = input2.split("\\s+");
//        int howManyPredators = Integer.parseInt(parts2[0]); // Первое число в переменной w
//        int howManyHerbivores = Integer.parseInt(parts2[1]);
//        int howManyPlants = Integer.parseInt(parts2[2]);
//
//        System.out.println("Введите процент вычита жизненной силы");
//        int lossOfLife = Integer.parseInt(sc.nextLine());

        int widht = 100;
        int height = 20;
        int howManyPredators = 608;
        int howManyHerbivores = 2500;
        int howManyPlants = 200;
        int lossOfLife = 25;


        Island island = new Island(widht, height, lossOfLife, howManyPredators, howManyHerbivores, howManyPlants);
        island.createGrid();
        island.createLive(howManyPredators);
        return island;
    }
}
