package com.ian.Singleton

import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class EnumSingletonTest extends Specification {


    def "GetInstance"() {
        when:
        def s1 = EnumSingleton.SINGLETON.getInstance()
        def s2 = EnumSingleton.SINGLETON.getInstance()
        then:
        s1 != null
        s2 != null
        s1 == s2

    }
}
