package com.ian.Observer;

import java.util.List;

/**
 * Created by Ian on 15/06/2015.
 */
public class MainSubject extends AbstractSubject {
    @Override
    public List<String> operation() {
        this.getResult().clear();
        return this.notifyObservers();
    }
}
