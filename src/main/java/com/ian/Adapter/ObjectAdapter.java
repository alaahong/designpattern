package com.ian.Adapter;

/**
 * Created by Ian on 04/06/2015.
 */
public class ObjectAdapter {
    private ClassAdaptee adaptee;

    public ObjectAdapter(ClassAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String func1() {
        return this.adaptee.func1();
    }

    public String func2() {
        return "func2";
    }
}
