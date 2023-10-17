package ch.hslu.oop.sw02;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(35);
        temperature.printTemperatureInCelcius();
        temperature.printTemperatureInKelvin();
        temperature.printTemperatureInFahrenheit();

        temperature.subtractTemperature(20);
        temperature.printTemperatureInCelcius();

        temperature.addTemperature(30);
        temperature.printTemperatureInCelcius();
    }
}