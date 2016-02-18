package com.example;

import spock.lang.Specification;
import static org.mockito.Mockito.*;

class FizzBuzzSpec extends Specification {
    def test() {
        def Fizz fizz = mock(Fizz.class);
        def Buzz buzz = mock(Buzz.class);

        setup:
        when(fizz.isFizz(3)).thenReturn(true);
        when(buzz.isBuzz(5)).thenReturn(true);
        when(fizz.isFizz(15)).thenReturn(true);
        when(buzz.isBuzz(15)).thenReturn(true);

        expect:
        def fizzBuzz = new FizzBuzz(fizz, buzz)
        fizzBuzz.isFizzBuzz(1) == "1"
        fizzBuzz.isFizzBuzz(3) == "Fizz"
        fizzBuzz.isFizzBuzz(5) == "Buzz"
        fizzBuzz.isFizzBuzz(15) == "FizzBuzz"
    }
}
