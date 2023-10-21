package ch.hslu.oop.sw03.e02;

public class Temperature {
    private double degreeInCelcius;

    public Temperature() {
        degreeInCelcius = 20;
    }

    public Temperature(double degreeInCelcius) {
        this.degreeInCelcius = degreeInCelcius;
    }

    public double getTemperatureInCelcius() {
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

    public AggregateState getAggregateState(String element) {
        return switch (element) {
            case "N" -> new Nitrogen(element, this).getAggregateState();
            case "Hg" -> new Quicksilver(element, this).getAggregateState();
            default -> AggregateState.UNDEFINED;
        };
    }

}
