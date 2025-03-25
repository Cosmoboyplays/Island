package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Goat extends Herbivore {
    private final String image = "\uD83D\uDC10";
    private final double weight = 60;
    public static final int maxItemsPerCell = 140;
    private final int cellMovesPerCycle = 3;
    private final double saturationAmount = 10;

    public Goat() {
        super();
    }
    public Goat(ArrayList<Integer> coords) {
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
