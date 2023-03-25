package com.app.springbootwebapplicationtesting.Algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/** DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
 *
 * Test Case 1:
 * Input:
 * n = 1
 * Output:  1
 * Explanation: Digital root of 1 is 1
 *
 * Test Case 2:
 * Input:
 * n = 99999
 * Output: 9
 * Explanation: Sum of digits of 99999 is 45
 * which is not a single digit number, hence
 * sum of digit of 45 is 9 which is a single
 * digit number.
 */
/** Algorithm :
 * Step 1 : Define a method digitalRoot(int n)
 * Step 2 : Define another method single(int n)
 * Step 3 : digitalRoot(int n) method takes output of single(int n) as input
 * if(single(int n) <= 9)
 * return single(n)
 * else
 * return digitalRoot(single(n))
 * Step 4 : single(int n) calculates the sum of digits of number n recursively
 * if(n<=9)
 * return n;
 * else
 * return (n%10) + (n/10)
 * Step 5 : In main method simply take n as input and then call digitalRoot(int n) function and print the result
 */

class DigitalRootTest {

    @Test
    void testDigitalroot() {
        assertEquals(4, DigitalRoot.digitalRoot(4));
        assertEquals(9, DigitalRoot.digitalRoot(9));
        assertEquals(4, DigitalRoot.digitalRoot(49));

    }
    @Test
    void testDigitalroot2() {
        assertEquals(6, DigitalRoot.digitalRoot(78));
        assertEquals(4, DigitalRoot.digitalRoot(1228));
        assertEquals(8, DigitalRoot.digitalRoot(71348));//actual its return 5

    }

}