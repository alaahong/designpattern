package com.ian.Bridge;

/**
 * Created by Ian on 15/06/2015.
 */
public abstract class PicBase {

    private AnimalBase animal;

    public AnimalBase getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalBase animal) {
        this.animal = animal;
    }
    abstract String draw();
}
