package classes.base;


import java.util.ArrayList;

public abstract class Plant extends Animal{
    private static ArrayList<Plant> instances = new ArrayList<>();

    public Plant() {
        instances.add(this);
    }
    public static ArrayList<Plant> getInstances() {
        return instances;
    }

    public abstract double getWeight();

    public abstract int getMaxItemsPerCell();

    public abstract String getImage();

    public abstract int getCellMovesPerCycle();

    public abstract double getSaturationAmount();
}
