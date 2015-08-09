package com.ian.Decorator.impl;

import com.ian.Decorator.IHuman;

/**
 * Created by Ian on 15/06/2015.
 */
public class English implements IHuman {
    private IHuman man;

    public English(IHuman man) {
        super();
        this.man = man;
    }

    @Override
    public String speak() {
        return man.speak() + speakEnglish();
    }

    private String speakEnglish() {
        return " Speak English";
    }
}
