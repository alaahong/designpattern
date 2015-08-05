package com.ian.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian on 03/06/2015.
 */
public abstract class Fruit {

    protected List<String> properties = new ArrayList<String>();

    public void add(String prop) {
        properties.add(prop);
    }

    public List<String> show() {
        return properties;
    }
}

