package com.dudarev.island.classes.herbivores;

import com.dudarev.island.classes.base.Herbivore;

public class Mouse extends Herbivore {
    private final String image = "\uD83D\uDC01";
    private final double weight = 0.05;
    private final int maxItemsPerCell = 500;
    private final int cellMovesPerCycle = 1;
    private final double saturationAmount = 0.01;

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
