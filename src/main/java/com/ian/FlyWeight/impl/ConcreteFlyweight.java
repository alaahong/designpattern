package com.ian.FlyWeight.impl;

import com.ian.FlyWeight.IFlyWeight;

/**
 * Created by Ian on 15/06/2015.
 */
public class ConcreteFlyweight implements IFlyWeight {
    private String answer;

    public ConcreteFlyweight(String answer) {
        this.answer = answer;
    }

    @Override
    public String getAnswer() {
        return answer;
    }
}

