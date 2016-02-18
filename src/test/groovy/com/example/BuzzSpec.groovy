package com.example;

import spock.lang.Specification;

class BuzzSpec extends Specification {
    
    def testWhenBuzz() {
        setup:
        def buzz = new Buzz()

        expect:
        buzz.isBuzz(5) == true
    }
    
    def testWhenNotBuzz() {
        setup:
        def buzz = new Buzz()

        expect:
        buzz.isBuzz(3) == false
    }
}
