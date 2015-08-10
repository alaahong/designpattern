package com.ian.Facade;

/**
 * Created by Ian on 15/06/2015.
 */
public class FruitStore {
    public Apple sellApple() {
        AppleFarmer farmer = new AppleFarmer();
        return farmer.produceApple();
    }

    public Grape sellGrape() {
        GrapeFarmer farmer = new GrapeFarmer();
        return farmer.produceGrape();
    }
}
