package com.ian.Observer

import com.ian.Observer.impl.ObserverA
import com.ian.Observer.impl.ObserverB
import spock.lang.Specification

/**
 * Created by Ian on 15/06/2015.
 */
class MainSubjectTest extends Specification {
    def "Operation"() {
        def observer = new MainSubject()
        observer.add(new ObserverA())
        observer.add(new ObserverB())
        def result = observer.operation()
        expect: ""
        result.size() == 2
        result.get(0).equals("Update ObserverA")
        result.get(1).equals("Update ObserverB")
    }
}
