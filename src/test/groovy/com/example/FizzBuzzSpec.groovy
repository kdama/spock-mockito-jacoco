package com.example;

import spock.lang.Specification;
import static org.mockito.Mockito.*;

class FizzBuzzSpec extends Specification {
    def Fizz fizz = mock(Fizz.class);
    def Buzz buzz = mock(Buzz.class);

    def setup() {
        when(fizz.isFizz(3)).thenReturn(true);
        when(buzz.isBuzz(5)).thenReturn(true);
        when(fizz.isFizz(15)).thenReturn(true);
        when(buzz.isBuzz(15)).thenReturn(true);
    }

    def testWithFizz() {
        expect:
        def fizzBuzz = new FizzBuzz(fizz, buzz)
        fizzBuzz.isFizzBuzz(3) == "Fizz"
    }

    def testWithBuzz() {
        expect:
        def fizzBuzz = new FizzBuzz(fizz, buzz)
        fizzBuzz.isFizzBuzz(5) == "Buzz"
    }

    def testWithFizzBuzz() {
        expect:
        def fizzBuzz = new FizzBuzz(fizz, buzz)
        fizzBuzz.isFizzBuzz(15) == "FizzBuzz"
    }

    def testWithNotFizzBuzz() {
        expect:
        def fizzBuzz = new FizzBuzz(fizz, buzz)
        fizzBuzz.isFizzBuzz(1) == "1"
    }
}
