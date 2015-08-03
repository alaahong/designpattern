package com.ian.Adapter

import spock.lang.Specification

/**
 * Created by Ian on 04/06/2015.
 */
class ObjectAdapterTest extends Specification {
    def "Func2"() {
        when:
        def adaptee = new ClassAdaptee()
        def adapter = new ObjectAdapter(adaptee)
        then:
        "func2".equals(adapter.func2())
    }

    def "Func1"() {
        when:
        def adaptee = new ClassAdaptee()
        def adapter = new ObjectAdapter(adaptee)
        then:
        "func1".equals(adapter.func1())
    }
}
