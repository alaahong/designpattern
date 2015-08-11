package com.ian.FactoryMethod

import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class StaticFactoryTest extends Specification {
    def "ProduceMail"() {
        "MailSender" == StaticFactory.produceMail()
    }

    def "ProduceSms"() {
        "SmsSender" == StaticFactory.produceSms()
    }
}
