package com.dudarev.island.classes.herbivores;

import com.dudarev.island.classes.base.Herbivore;

public class Duck extends Herbivore {
    private final String image = "\uD83E\uDD86";
    private final double weight = 1;
    private final int maxItemsPerCell = 200;
    private final int cellMovesPerCycle = 4;
    private final double saturationAmount = 0.15;

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
