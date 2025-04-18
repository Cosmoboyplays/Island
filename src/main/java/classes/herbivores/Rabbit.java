package classes.herbivores;

import classes.base.Herbivore;

import java.util.ArrayList;

public class Rabbit extends Herbivore {
    private final String image = "\uD83D\uDC07";
    private final double weight = 2;
    public static final int maxItemsPerCell = 150;
    private final int cellMovesPerCycle = 2;
    private final double saturationAmount = 0.45;

    public Rabbit() {
        super();
    }
    public Rabbit(ArrayList<Integer> coords) {
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
