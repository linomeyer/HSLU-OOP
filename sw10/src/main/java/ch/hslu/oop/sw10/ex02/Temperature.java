package ch.hslu.oop.sw10.ex02;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    public static final double KELVIN_OFFSET = 273.15;
    private double degreeInCelsius;

    private Temperature(double degreeInCelsius) {
        if (degreeInCelsius >= -273.15) {
            this.degreeInCelsius = degreeInCelsius;
        } else {
            throw new IllegalArgumentException("This temperature is not physically possible.");
        }
    }

    public static Temperature createFromCelsius(final double degreeInCelsius) {
        return new Temperature(degreeInCelsius);
    }

    public static Temperature createFromKelvin(final double degreeInKelvin) {
        return new Temperature(convertKelvinToCelsius(degreeInKelvin));
    }

    public static double convertCelsiusToKelvin(double degreeInCelsius) {
        return degreeInCelsius + KELVIN_OFFSET;
    }


    public static double convertKelvinToCelsius(double degreeInKelvin) {
        return degreeInKelvin - KELVIN_OFFSET;
    }

    public double getTemperatureInCelcius() {
        return degreeInCelsius;
    }

    public void subtractTemperature(double degreeInCelsiusToSubtract) {
        degreeInCelsius -= degreeInCelsiusToSubtract;
    }

    public void addTemperature(double degreeInCelsiusToAdd) {
        degreeInCelsius += degreeInCelsiusToAdd;
    }

    public void printTemperatureInCelsius() {
        System.out.println("Temperature in Celsius: " + degreeInCelsius);
    }

    public void printTemperatureInKelvin() {
        System.out.println("Temperature in Kelvin: " + Temperature.convertCelsiusToKelvin(degreeInCelsius));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o instanceof Temperature t) && Double.compare(degreeInCelsius, t.degreeInCelsius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(degreeInCelsius);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "degreeInCelsius=" + degreeInCelsius +
                '}';
    }

    @Override
    public int compareTo(Temperature t) {
        return Double.compare(degreeInCelsius, t.degreeInCelsius);
    }
}
