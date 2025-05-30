package com.practice.junitproject.temperature_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.practice.junitproject.temperature.TemperatureConverter;

class TemperatureConverterTest {

    /**
     * Tests Celsius to Fahrenheit conversion.
     */
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001, "0°C should be 32°F");
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001, "100°C should be 212°F");
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.001, "37°C should be 98.6°F");
    }

    /**
     * Tests Fahrenheit to Celsius conversion.
     */
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001, "32°F should be 0°C");
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001, "212°F should be 100°C");
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.001, "98.6°F should be 37°C");
    }
}

