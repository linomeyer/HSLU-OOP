package ch.hslu.oop.sw05.ex02;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        temperature.printTemperatureInKelvin();
        temperature.printTemperatureInCelcius();
        temperature.printTemperatureInFahrenheit();

        Nitrogen nitrogen = new Nitrogen(temperature);
        System.out.println("\nAggregate state of nitrogen: " + nitrogen.getAggregateState());

        Quicksilver quicksilver = new Quicksilver(temperature);
        System.out.println("\nAggregate state of quicksilver: " + quicksilver.getAggregateState());
    }
}
