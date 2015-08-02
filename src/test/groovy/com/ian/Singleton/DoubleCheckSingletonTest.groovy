package com.ian.Singleton

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class DoubleCheckSingletonTest extends Specification {
    @Shared
    def singleton

    def setup() {
        singleton = new DoubleCheckSingleton()
    }

    def "GetInstance"() {
        when:
        def s1 = singleton.getInstance()
        def s2 = singleton.getInstance()
        then:
        s1 != null
        s2 != null
        s1 == s2
    }
}
