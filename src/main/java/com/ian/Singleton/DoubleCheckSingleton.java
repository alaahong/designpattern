package com.ian.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Ian on 02/06/2015.
 */
public class DoubleCheckSingleton implements Serializable {
    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton singleton;

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null)
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null)
                    singleton = new DoubleCheckSingleton();
            }
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }
}

