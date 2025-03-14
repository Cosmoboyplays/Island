package classes.plants;

import classes.base.Plant;

public class Grass extends Plant {
    private final String image = "\uD83C\uDF31";
    private final double weight = 1;
    public static final int maxItemsPerCell = 200;

    public String getImage() {
        return image;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxItemsPerCell() {
        return maxItemsPerCell;
    }

    // эти пришлось из-за наследования от animal
    @Override
    public int getCellMovesPerCycle() {
        return 0;
    }

    @Override
    public double getSaturationAmount() {
        return 0;
    }
}
