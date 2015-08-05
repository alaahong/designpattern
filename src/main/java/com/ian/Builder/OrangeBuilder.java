package com.ian.Builder;

/**
 * Created by Ian on 03/06/2015.
 */
public class OrangeBuilder implements FruitBuilder {
    private Fruit fruit = new Orange();

    @Override
    public void buildCorlor() {
        fruit.add("Color: Orange");
    }

    @Override
    public void buildWeight() {
        fruit.add("Weight: Light");
    }

    @Override
    public Fruit getAllProperties() {
        return fruit;
    }
}
