package com.ian.Adapter

import spock.lang.Specification

/**
 * Created by Ian on 04/06/2015.
 */
class InterfaceAdapterBaseTest extends Specification {
    def "Func1"() {
        when:
        def adapter = new AdapterFunc1()
        then:
        "func1".equals(adapter.func1())
    }

    def "Func2"() {
        when:
        def adapter = new AdapterFunc2()
        then:
        "func2".equals(adapter.func2())

    }
}
