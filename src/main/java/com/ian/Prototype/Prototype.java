package com.ian.Prototype;

/**
 * Created by Ian on 03/06/2015.
 */
public class Prototype implements Cloneable {
    private InnerClass obj;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype obj = (Prototype) super.clone();
        return obj;
    }

    public InnerClass getObj() {
        return obj;
    }

    public void setObj() {
        this.obj = new InnerClass();
    }

    class InnerClass {
    }
}
