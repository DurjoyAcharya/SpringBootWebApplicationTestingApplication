package com.app.springbootwebapplicationtesting.Algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A perfect number is a positive integer equal to half the sum of its divisors
 */
class AliquotSumTest {
    @Test
    void testGetMaxValue() {
        assertEquals(1, AliquotSum.getAliquotValue(1));
        assertEquals(6, AliquotSum.getAliquotValue(6));
        assertEquals(9, AliquotSum.getAliquotValue(15));
        assertEquals(1, AliquotSum.getAliquotValue(19));
    }
}