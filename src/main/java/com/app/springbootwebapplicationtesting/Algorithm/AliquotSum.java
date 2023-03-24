package com.app.springbootwebapplicationtesting.Algorithm;

import java.util.stream.IntStream;

/**
 * In number theory, the aliquot sum s(n) of a positive integer n is
 * the sum of all proper divisors of n, that is, all divisors of n
 * other than n itself.
 * That is, {\displaystyle s(n)=\sum \nolimits _{d|n, \ d\neq n}d.}
 */



public class AliquotSum {
    public static int getAliquotValue(int number) {
        var sumWrapper = new Object() {
            int value = 0;
        };

        IntStream.iterate(1, i -> ++i)
                .limit(number / 2)
                .filter(i -> number % i == 0)
                .forEach(i -> sumWrapper.value += i);

        return sumWrapper.value;
    }
}
