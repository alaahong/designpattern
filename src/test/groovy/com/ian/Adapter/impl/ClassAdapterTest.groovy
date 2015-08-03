package com.ian.Adapter.impl

import spock.lang.Specification

/**
 * Created by Ian on 04/06/2015.
 */
class ClassAdapterTest extends Specification {
    def "Func2"() {
        when:
        def adapter = new ClassAdapter()
        then:
        "func2".equals(adapter.func2())
    }

    def "Func1"() {
        when:
        def adapter = new ClassAdapter()
        then:
        "func1".equals(adapter.func1())
    }
}
