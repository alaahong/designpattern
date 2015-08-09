package com.ian.Decorator.impl;

import com.ian.Decorator.IHuman;

/**
 * Created by Ian on 04/06/2015.
 */
public class Man implements IHuman {
    @Override
    public String speak() {
        return "Man is man";
    }
}
