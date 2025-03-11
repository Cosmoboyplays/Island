package classes.base;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Animal {
    public abstract double getWeight();

    public abstract int getMaxItemsPerCell();

    public abstract String getImage();

    public abstract int getCellMovesPerCycle();

    public abstract double getSaturationAmount();

}
