package com.ian.Builder;

/**
 * Created by Ian on 03/06/2015.
 */
public class AppleBuilder implements FruitBuilder {

    private Fruit fruit = new Apple();

    @Override
    public void buildCorlor() {
        fruit.add("Color: Red");
    }

    @Override
    public void buildWeight() {
        fruit.add("Weight: Heavy");
    }

    @Override
    public Fruit getAllProperties() {
        return fruit;
    }
}
