package classes.base;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Animal {
    protected int satietyAmount = 100;
    private ArrayList<Integer> coords;
    private Boolean multiplied = true;

    public void eat() {
    }

    public void move() {
    }

    public void produce() {
        System.out.println("размножаемся");
    }

    public ArrayList<Integer> getCoords() {
        return coords;
    }

    public void setCoords(ArrayList<Integer> coords) {
        this.coords = coords;
    }

    public abstract double getWeight();

    public abstract int getMaxItemsPerCell();

    public abstract String getImage();

    public abstract int getCellMovesPerCycle();

    public abstract double getSaturationAmount();

    public int getSatietyAmount() {
        return satietyAmount;
    }

    public void setSatietyAmount(int satietyAmount) {
        if (satietyAmount > 100) this.satietyAmount = 100;
        else this.satietyAmount = satietyAmount;
    }

    public Boolean getMultiplied() {
        return multiplied;
    }

    public void setMultiplied(Boolean multiplied) {
        this.multiplied = multiplied;
    }

    public abstract CopyOnWriteArrayList<Animal> getInstances();
}

