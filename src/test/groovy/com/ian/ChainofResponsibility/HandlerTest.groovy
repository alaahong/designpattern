package com.ian.ChainofResponsibility

import spock.lang.Specification

/**
 * Created by Ian on 24/06/2015.
 */
class HandlerTest extends Specification {
    def "Act"() {
        def h1 = new Handler("h1")
        def h2 = new Handler("h2")
        def h3 = new Handler("h3")
        h1.setHandler(h2)
        h2.setHandler(h3)
        expect:
        h3.act()

    }
}
