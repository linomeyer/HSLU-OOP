package ch.hslu.oop.sw06.ex02;

public class Temperature {
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

}
