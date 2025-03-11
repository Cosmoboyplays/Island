package com.dudarev.island.classes.herbivores;

import com.dudarev.island.classes.base.Herbivore;

public class Sheep extends Herbivore {
    private final String image = "\uD83D\uDC11";
    private final double weight = 70;
    private final int maxItemsPerCell = 140;
    private final int cellMovesPerCycle = 3;
    private final double saturationAmount = 15;

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
