package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Duck extends Herbivore {
    private final String image = "\uD83E\uDD86";
    private final double weight = 1;
    public static final int maxItemsPerCell = 200;
    private final int cellMovesPerCycle = 4;
    private final double saturationAmount = 0.15;

    public Duck() {
        super();
    }
    public Duck(ArrayList<Integer> coords) {
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
