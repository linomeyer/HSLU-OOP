package ch.hslu.oop.sw09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                LOG.info("Temperature: {}°C", value);
            } catch (NumberFormatException exception) {
                if (!input.equals("exit")) {
                    System.out.println("Bitte eine Zahl eingeben!");
                    LOG.error("Not a Temperature!", exception);
                }
            }
        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}