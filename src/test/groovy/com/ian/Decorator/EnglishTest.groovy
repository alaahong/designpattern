package com.ian.Decorator

import com.ian.Decorator.impl.English
import com.ian.Decorator.impl.Man
import spock.lang.Specification

/**
 * Created by Ian on 24/06/2015.
 */
class EnglishTest extends Specification {
    def "Speak"() {
        def man = new Man()
        def obj = new English(man)
        expect:
        "Man is man Speak English".equals(obj.speak())

    }
}
