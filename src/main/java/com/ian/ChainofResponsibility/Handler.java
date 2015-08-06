package com.ian.ChainofResponsibility;

import com.ian.ChainofResponsibility.impl.HandlerBase;

/**
 * Created by Ian on 24/06/2015.
 */
public class Handler extends HandlerBase {
    public Handler(String name) {
        System.out.println(name + " ! ");
    }

    @Override
    public void act() {

        if (getHandler() != null) {
            getHandler().act();
        }
    }
}
