package com.ian.Bridge;

/**
 * Created by Ian on 15/06/2015.
 */
public class RedPaint extends PicBase{
    @Override
    String draw(){
        return "Red "+this.getAnimal().drawAnimal();
    }
}
