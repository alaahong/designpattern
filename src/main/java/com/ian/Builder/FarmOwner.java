package com.ian.Builder;

/**
 * Created by Ian on 03/06/2015.
 */
public class FarmOwner {
    private FruitBuilder fruitBuilder;

    public FarmOwner(FruitBuilder fruitBuilder) {
        this.fruitBuilder = fruitBuilder;
    }

    public void init() {
        fruitBuilder.buildCorlor();
        fruitBuilder.buildWeight();
    }
}
