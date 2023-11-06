package ch.hslu.oop.sw08.ex01;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    public static final double KELVIN_OFFSET = 273.15;
    public static final int FAHRENHEIT_OFFSET = 32;
    private double degreeInCelsius;

    public Temperature() {
        degreeInCelsius = 20;
    }

    public Temperature(double degreeInCelsius) {
        this.degreeInCelsius = degreeInCelsius;
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

    public void setDegreeInCelsius(double degreeInCelsius) {
        this.degreeInCelsius = degreeInCelsius;
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
