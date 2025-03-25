package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Buffalo extends Herbivore {
    private final String image = "\uD83D\uDC03";
    private final double weight = 700;
    public static final int maxItemsPerCell = 10;
    private final int cellMovesPerCycle = 3;
    private final double saturationAmount = 100;

    public Buffalo() {
        super();
    }
    public Buffalo(ArrayList<Integer> coords) {
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
