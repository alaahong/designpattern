package com.ian.Observer;

import java.util.List;

/**
 * Created by Ian on 15/06/2015.
 */
public interface ISubject {
    public void add(IObserver observer);


    public void del(IObserver observer);


    public List<String> notifyObservers();


    public List<String> operation();
}
