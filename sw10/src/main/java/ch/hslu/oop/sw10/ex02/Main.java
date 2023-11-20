package ch.hslu.oop.sw10.ex02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        TemperatureProgression temperatureProgression = new TemperatureProgression();
        temperatureProgression.addTemperatureAddListener(e -> System.out.printf("New %s Temperature was added: %s \n",
                e.getType(), e.getAddedTemperature()));
        do {
            System.out.println("Bitte Temperatur in Celsius eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                double value = Double.parseDouble(input);
                temperatureProgression.add(Temperature.createFromCelsius(value));
                LOG.info("Temperature: {}°C", value);
            } catch (NumberFormatException exception) {
                if (!input.equals("exit")) {
                    System.out.println("Bitte eine Zahl eingeben!");
                    LOG.error("Not a Temperature!", exception);
                } else {
                    System.out.println(temperatureProgression);
                }
            }
        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}
