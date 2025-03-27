package classes.base;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Plant extends Animal {
    private static CopyOnWriteArrayList<Animal> instances = new CopyOnWriteArrayList<>();

    public Plant() {
        instances.add(this);
    }

    public CopyOnWriteArrayList<Animal> getInstances() {
        return instances;

    }

    public static CopyOnWriteArrayList<Animal> getStaticInstances() {
        return instances;

    }

    public abstract double getWeight();

    public abstract int getMaxItemsPerCell();

    public abstract String getImage();

    public abstract int getCellMovesPerCycle();

    public abstract double getSaturationAmount();
}
