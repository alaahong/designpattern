package com.ian.Adapter.impl;

import com.ian.Adapter.ClassAdaptee;
import com.ian.Adapter.IClassTarget;

/**
 * Created by Ian on 04/06/2015.
 */
public class ClassAdapter extends ClassAdaptee implements IClassTarget {
    @Override
    public String func2() {
        return "func2";
    }
}
