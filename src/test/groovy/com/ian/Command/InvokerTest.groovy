package com.ian.Command

import com.ian.Command.impl.Command
import spock.lang.Specification

/**
 * Created by Ian on 24/06/2015.
 */
class InvokerTest extends Specification {
    def "Action"() {
        def receiver = new Receiver()
        def cmd = new Command(receiver)
        def invoker = new Invoker(cmd)
        expect:
        "Yes command!".equals(invoker.action())
    }
}
