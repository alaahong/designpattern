package com.ian.Facade

import spock.lang.Specification

/**
 * Created by Ian on 15/06/2015.
 */
class FruitStoreTest extends Specification {
    def "SellApple"() {
        expect: ""
        "Red".equals(new FruitStore().sellApple().getColor())
    }

    def "SellGrape"() {
        expect: ""
        "Purple".equals(new FruitStore().sellGrape().getColor())
    }
}
