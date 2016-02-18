package com.example;

import spock.lang.Specification;

class FizzSpec extends Specification {

    def testWhenFizz() {
        setup:
        def fizz = new Fizz()

        expect:
        fizz.isFizz(3) == true
    }

    def testWhenNotFizz() {
        setup:
        def fizz = new Fizz()

        expect:
        fizz.isFizz(5) == false
    }
}
