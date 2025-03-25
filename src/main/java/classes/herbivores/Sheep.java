package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Sheep extends Herbivore {
    private final String image = "\uD83D\uDC11";
    private final double weight = 70;
    public static final int maxItemsPerCell = 140;
    private final int cellMovesPerCycle = 3;
    private final double saturationAmount = 15;

    public Sheep() {
        super();
    }
    public Sheep(ArrayList<Integer> coords) {
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
