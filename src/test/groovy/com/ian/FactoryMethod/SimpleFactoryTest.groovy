package com.ian.FactoryMethod

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class SimpleFactoryTest extends Specification {

    @Shared
    def factory

    def setup() {
        factory = new SimpleFactory()
    }

    def "Produce"() {

        expect:
        result == factory.produce(param)

        where:
        param  | result
        "m"    | "MailSender"
        "s"    | "SmsSender"
        "null" | null
        null   | null
    }
}
