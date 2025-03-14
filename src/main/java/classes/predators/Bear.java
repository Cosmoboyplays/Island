package classes.predators;
import classes.base.Predator;

public class Bear extends Predator {
    private final String image = "\uD83D\uDC3B";
    private final double weight = 500;
    public static final int maxItemsPerCell = 5;
    private final int cellMovesPerCycle = 2;
    private final double saturationAmount = 80;


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
