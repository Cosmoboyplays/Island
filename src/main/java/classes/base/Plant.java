package classes.base;


import java.util.ArrayList;

public abstract class Plant extends Animal{
    private static ArrayList< Animal> instances = new ArrayList<>();

    public Plant() {
        instances.add(this);
    }
    public ArrayList<Animal> getInstances() {
        return instances;
    }
    public static ArrayList<Animal> getStaticInstances() {
        return instances;
    }

    public abstract double getWeight();

    public abstract int getMaxItemsPerCell();

    public abstract String getImage();

    public abstract int getCellMovesPerCycle();

    public abstract double getSaturationAmount();
}
