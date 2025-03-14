package classes.herbivores;

import classes.base.Herbivore;

public class Caterpillar extends Herbivore {
    private final String image = "\uD83D\uDC1B";
    private final double weight = 0.01;
    public static final int maxItemsPerCell = 1000;
    private final int cellMovesPerCycle = 0;
    private final double saturationAmount = 0;

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
