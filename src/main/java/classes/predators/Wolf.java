package classes.predators;

import classes.base.Predator;

import java.util.ArrayList;

public class Wolf extends Predator {
    private final String image = "\uD83D\uDC3A";
    private final double weight = 50;
    public static final int maxItemsPerCell = 30;
    private final int cellMovesPerCycle = 3;
    private final double saturationAmount = 8;

    public Wolf() {
        super();
    }

    public Wolf(ArrayList<Integer> coords) {
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
