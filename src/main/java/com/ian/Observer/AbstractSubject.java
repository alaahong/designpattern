package com.ian.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Ian on 15/06/2015.
 */
public abstract class AbstractSubject implements ISubject {
    Queue<IObserver> queue = new ArrayDeque<IObserver>();
    List<String> result = new ArrayList<String>();

    public List<String> getResult() {
        return result;
    }

    @Override
    public void add(IObserver observer) {
        queue.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        queue.remove();
    }

    @Override
    public List<String> notifyObservers() {
        for (IObserver observer : queue) {
            result.add(observer.update());
        }
        return result;
    }
}
