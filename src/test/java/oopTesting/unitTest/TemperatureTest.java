package oopTesting.unitTest;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    public void celsiusValueTest() {
        Random random = new Random();
        int value = random.nextInt(100);
        Temperature temperature = new Temperature();
        temperature.setCelsius(value);
        assertEquals(value,temperature.getCelsius(),0.0);
    }
    @Test
    public void fahrenheitValueTest() {
        Random random = new Random();
        int value = random.nextInt(100);

        Temperature temperature = new Temperature();
        temperature.setFahrenheit(value);
        assertEquals(value, temperature.getFahrenheit(), 0.0);
    }

    @Test
    public void absoluteZeroCelsiusTest() {
        Temperature temperature = new Temperature();
        double value = temperature.getAbsoluteZeroCelsius();
        assertEquals(value, -273.15, 0.0);
    }

    @Test
    public void absoluteZeroFahrenheitTest() {
        Temperature temperature = new Temperature();
        double value = temperature.getAbsoluteZeroFahrenheit();
        assertEquals(value, -459.67, 0.0);
    }

    @Test
    public void celsiusToFahrenheit() {
        Temperature temperature = new Temperature();
        double value = temperature.toFahrenheit(37);
        assertEquals(value, 98.6, 0.0);
    }

    @Test
    public void fahrenheitToCelsius() {
        Temperature temperature = new Temperature();
        double value = temperature.toCelsius(98.6);
        assertEquals(value, 37, 0.0);
    }

    @Test()
    public void celsiusBelowAbsoluteZero() {
        Temperature temperature = new Temperature();
        assertThrows(IllegalAccessError.class,()->{
            temperature.setCelsius(-500);
        });
    }

    @Test()
    public void fahrenheitBelowAbsoluteZero() {
        Temperature temperature = new Temperature();
        assertThrows(IllegalAccessError.class,()->{
            temperature.setFahrenheit(-500);
        });
    }

}