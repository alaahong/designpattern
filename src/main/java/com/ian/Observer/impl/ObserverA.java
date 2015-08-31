package com.ian.Observer.impl;

import com.ian.Observer.IObserver;

/**
 * Created by Ian on 15/06/2015.
 */
public class ObserverA implements IObserver {
    @Override
    public String update() {
        return "Update ObserverA";
    }
}
