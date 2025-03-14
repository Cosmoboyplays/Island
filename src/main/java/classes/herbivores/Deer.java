package classes.herbivores;

import classes.base.Herbivore;

public class Deer extends Herbivore {
    private final String image = "\uD83E\uDD8C";
    private final double weight = 300;
    public static final int maxItemsPerCell = 20;
    private final int cellMovesPerCycle = 4;
    private final double saturationAmount = 50;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getMaxItemsPerCell() {
        return maxItemsPerCell;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public int getCellMovesPerCycle() {
        return cellMovesPerCycle;
    }

    @Override
    public double getSaturationAmount() {
        return saturationAmount;
    }
}
