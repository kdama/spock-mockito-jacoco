package com.example;

public class FizzBuzz {

    Fizz fizz;
    Buzz buzz;

    public FizzBuzz(Fizz fizz, Buzz buzz) {
        this.fizz = fizz;
        this.buzz = buzz;
    }

    public String isFizzBuzz(int n) {
        if (fizz.isFizz(n) && buzz.isBuzz(n)) {
            return "FizzBuzz";
        } else if (fizz.isFizz(n)) {
            return "Fizz";
        } else if (buzz.isBuzz(n)) {
            return "Buzz";
        } else {
            return "" + n;
        }
    }
}
