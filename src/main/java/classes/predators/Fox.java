package classes.predators;

import classes.base.Predator;

import java.util.ArrayList;

public class Fox extends Predator {
    private final String image = "\uD83E\uDD8A";
    private final double weight = 8;
    public static final int maxItemsPerCell = 30;
    private final int cellMovesPerCycle = 2;
    private final double saturationAmount = 2;

    public Fox() {
        super();
    }
    public Fox(ArrayList<Integer> coords) {
        super(coords);
    }
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
