package com.dudarev.island.classes.herbivores;

import com.dudarev.island.classes.base.Herbivore;

public class Rabbit extends Herbivore {
    private final String image = "\uD83D\uDC07";
    private final double weight = 2;
    private final int maxItemsPerCell = 150;
    private final int cellMovesPerCycle = 2;
    private final double saturationAmount = 0.45;

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
