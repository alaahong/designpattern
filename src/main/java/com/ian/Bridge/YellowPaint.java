package com.ian.Bridge;

/**
 * Created by Ian on 15/06/2015.
 */
public class YellowPaint extends PicBase {
    @Override
    String draw() {
        return "Yellow " + this.getAnimal().drawAnimal();
    }
}
