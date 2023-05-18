package oopTesting.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestReporter;
class MyCalculatorTest {
    TestReporter ts;
    private MyCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new MyCalculator();
    }
    @Test
    @DisplayName("Test addition")
    void testAdd(TestReporter testReporter) {
     int result = calculator.add(2, 3);
      assertEquals(5, result);
      testReporter.publishEntry("Test add: Passed");
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSub(TestReporter testReporter) {
     int result = calculator.add(22, 3);
      assertEquals(18, result);
      testReporter.publishEntry("Test sub: Passed");
    }

}