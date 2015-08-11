package com.ian.FactoryMethod

import com.ian.FactoryMethod.impl.MailAbstractFactory
import com.ian.FactoryMethod.impl.SmsAbstractFactory
import spock.lang.Specification

/**
 * Created by Ian on 02/06/2015.
 */
class IFactoryProviderTest extends Specification {
    def "Produce"() {
        when:
        IFactoryProvider provider = factory
        then:
        provider.produce() == result
        where:
        factory                   | result
        new SmsAbstractFactory()  | "SmsSender"
        new MailAbstractFactory() | "MailSender"
    }
}
