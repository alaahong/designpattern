package com.ian.FactoryMethod

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class MultiFactoryTest extends Specification {
    @Shared
    def factory

    def setup() {
        factory = new MultiFactory()
    }

    def "ProduceMail"() {
        expect:
        "MailSender" == factory.produceMail()

    }

    def "ProduceSms"() {
        expect:
        "SmsSender" == factory.produceSms()
    }

}
