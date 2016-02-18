package com.example;

import spock.lang.Specification;

class FizzSpec extends Specification {

    def test() {
        setup:
        def fizz = new Fizz()

        expect:
        fizz.isFizz(3) == true
        fizz.isFizz(5) == false
    }
}
