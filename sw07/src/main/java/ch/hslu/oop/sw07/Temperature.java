package ch.hslu.oop.sw07;

import java.util.Objects;

public class Temperature implements Comparable<Temperature> {
    private double degreeInCelsius;

    public Temperature() {
        degreeInCelsius = 20;
    }

    public Temperature(double degreeInCelcius) {
        this.degreeInCelsius = degreeInCelcius;
    }

    public double getTemperatureInCelcius() {
        return degreeInCelsius;
    }

    public void setDegreeInCelsius(float degreeInCelsius) {
        this.degreeInCelsius = degreeInCelsius;
    }

    public double getTemperatureInKelvin() {
        return degreeInCelsius + 273.15;
    }

    public double getTemperatureInFahrenheit() {
        return degreeInCelsius * 1.8 + 32;
    }

    public void subtractTemperature(double degreeInCelsiusToSubtract) {
        degreeInCelsius -= degreeInCelsiusToSubtract;
    }

    public void addTemperature(double degreeInCelsiusToAdd) {
        degreeInCelsius += degreeInCelsiusToAdd;
    }

    public void printTemperatureInCelcius() {
        System.out.println("Temperature in Celsius: " + degreeInCelsius);
    }

    public void printTemperatureInFahrenheit() {
        System.out.println("Temperature in Fahrenheit: " + getTemperatureInFahrenheit());
    }

    public void printTemperatureInKelvin() {
        System.out.println("Temperature in Kelvin: " + getTemperatureInKelvin());
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
