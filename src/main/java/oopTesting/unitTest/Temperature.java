package oopTesting.unitTest;

public class Temperature {
    private double _celsius;
    private double _fahrenheit;

    // Returns absolute zero Celsius.
    public double getAbsoluteZeroCelsius() {
        return -273.15;
    }

    //Returns absolute zero Fahrenheit.
    public double getAbsoluteZeroFahrenheit() {
        return -459.67;
    }

    // Returns Celsius value.
    public double getCelsius() {
        return this._celsius;
    }

    // Sets Celsius value.
    public void setCelsius(double value) {
        this._celsius = this.validateCelsius(value);
        this._fahrenheit = this.toFahrenheit(value);
    }

    // Returns Fahrenheit value.
    public double getFahrenheit() {
        return this._fahrenheit;
    }

    // Sets Celsius value.
    public void setFahrenheit(double value) {
        this._fahrenheit = this.validateFahrenheit(value);
        this._celsius = this.toCelsius(value);
    }

    // Converts Fahrenheit temperature to Celsius.
    public double toCelsius(double fahrenheit) {
        fahrenheit = validateFahrenheit(fahrenheit);
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Converts Celsius temperature to Fahrenheit.
    public double toFahrenheit(double celsius) {
        celsius = validateCelsius(celsius);
        return celsius * 9.0 / 5.0 + 32;
    }

    // Validates Celsius temperature.
    // Throws error if Celsius temperature is below absolute zero.
    private double validateCelsius(double celsius) {
        if (celsius < this.getAbsoluteZeroCelsius()) {
            throw new IllegalArgumentException(
                    "celsius must not be below absolute zero (" +
                            this.getAbsoluteZeroCelsius() + "). Received " + celsius);
        }

        return celsius;
    }

    // Validates Fahrenheit temperature.
    // Throws error if Fahrenheit temperature is below absolute zero.
    private double validateFahrenheit(double fahrenheit) {
        if (fahrenheit < this.getAbsoluteZeroFahrenheit()) {
            throw new IllegalArgumentException(
                    "fahrenheit must not be below absolute zero (" +
                            this.getAbsoluteZeroFahrenheit() + "). Received " + fahrenheit);
        }

        return fahrenheit;
    }
}
