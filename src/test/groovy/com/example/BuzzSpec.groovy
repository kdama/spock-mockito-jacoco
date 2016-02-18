package com.example;

import spock.lang.Specification;

class BuzzSpec extends Specification {

    def test() {
        setup:
        def buzz = new Buzz()

        expect:
        buzz.isBuzz(3) == false
        buzz.isBuzz(5) == true
    }
}
