package com.ian.Bridge

import spock.lang.Specification

/**
 * Created by Ian on 15/06/2015.
 */
class PicBaseTest extends Specification {
    def "Draw"() {
        when: ""
        def animal = newClass
        def color = newColor
        color.setAnimal(animal)
        then: ""
        color.draw().equals(Result)
        where:
        newClass       | newColor          | Result
        new CatPaint() | new RedPaint()    | "Red Cat"
        new CatPaint() | new YellowPaint() | "Yellow Cat"
        new DogPaint() | new RedPaint()    | "Red Dog"
        new DogPaint() | new YellowPaint() | "Yellow Dog"
    }
}
