package com.ian.FlyWeight

import spock.lang.Specification

/**
 * Created by Ian on 15/06/2015.
 */
class FlyWeightFactoryTest extends Specification {
    def "GetAnswer"() {
        expect: ""
        def factory = new FlyWeightFactory()
        factory.getAnswer("q1") == factory.getAnswer("q1")
        factory.getAnswer("q1") != factory.getAnswer("q2")
    }
}
