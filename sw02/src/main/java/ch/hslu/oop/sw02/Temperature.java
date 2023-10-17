package ch.hslu.oop.sw02;

public class Temperature {
    private double degreeInCelcius;

    public Temperature() {
        degreeInCelcius = 20;
    }

    public Temperature(double degreeInCelcius) {
        this.degreeInCelcius = degreeInCelcius;
    }

    public double getDegreeInCelcius() {
        return degreeInCelcius;
    }

    public void setDegreeInCelcius(float degreeInCelcius) {
        this.degreeInCelcius = degreeInCelcius;
    }

    public double getTemperatureInKelvin() {
        return degreeInCelcius + 273.15;
    }

    public double getTemperatureInFahrenheit() {
        return degreeInCelcius * 1.8 + 32;
    }

    public void subtractTemperature(double degreeInCelciusToSubtract) {
        degreeInCelcius -= degreeInCelciusToSubtract;
    }

    public void addTemperature(double degreeInCelciusToAdd) {
        degreeInCelcius += degreeInCelciusToAdd;
    }

    public void printTemperatureInCelcius() {
        System.out.println(degreeInCelcius);
    }
 
    public void printTemperatureInFahrenheit() {
        System.out.println(getTemperatureInFahrenheit());
    }

    public void printTemperatureInKelvin() {
        System.out.println(getTemperatureInKelvin());
    }
}
