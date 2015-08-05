package com.ian.Builder

import spock.lang.Specification

/**
 * Created by Ian on 03/06/2015.
 */
class FarmOwnerTest extends Specification {


    def "Init"() {
        when:
        def owner = new FarmOwner(builder)
        owner.init()
        def fruit = builder.getAllProperties().show()
        then:
        fruit.contains(color)
        fruit.contains(weight)

        where:
        builder             | color           | weight
        new AppleBuilder()  | "Color: Red"    | "Weight: Heavy"
        new OrangeBuilder() | "Color: Orange" | "Weight: Light"

    }
}
