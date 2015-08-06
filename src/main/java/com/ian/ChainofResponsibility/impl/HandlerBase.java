package com.ian.ChainofResponsibility.impl;

import com.ian.ChainofResponsibility.IHandler;

/**
 * Created by Ian on 24/06/2015.
 */
public abstract class HandlerBase implements IHandler {
    private IHandler handler;


    public IHandler getHandler() {
        return handler;
    }

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
