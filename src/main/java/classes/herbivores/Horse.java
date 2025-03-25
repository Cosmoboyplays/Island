package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Horse extends Herbivore {
    private final String image = "\uD83D\uDC0E";
    private final double weight = 400;
    public static final int maxItemsPerCell = 20;
    private final int cellMovesPerCycle = 4;
    private final double saturationAmount = 6;

    public Horse() {
        super();
    }
    public Horse(ArrayList<Integer> coords) {
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
