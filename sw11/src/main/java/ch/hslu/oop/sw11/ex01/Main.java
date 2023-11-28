package ch.hslu.oop.sw11.ex01;

import ch.hslu.oop.sw11.ex02.Measurement;
import ch.hslu.oop.sw11.temperature.Temperature;
import ch.hslu.oop.sw11.temperature.TemperatureProgression;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TemperatureProgression temperatureProgression =
                getTemperatureProgression();

        try (final DataOutputStream dos = createDataOutputStream()) {
            dos.writeInt(temperatureProgression.getMeasurements().size());
            for (Measurement measurement : temperatureProgression.getMeasurements()) {
                dos.writeDouble(measurement.getMinTemp().getTemperatureInCelsius());
                dos.writeDouble(measurement.getMaxTemp().getTemperatureInCelsius());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (final DataInputStream dis = createDataInputStream()) {
            System.out.println(dis.readInt());
            for (Measurement measurement : temperatureProgression.getMeasurements()) {
                System.out.println(dis.readDouble());
                System.out.println(dis.readDouble());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static DataInputStream createDataInputStream() throws FileNotFoundException {
        return new DataInputStream(new FileInputStream("./sw11/src/main/resources/test.txt"));
    }

    private static DataOutputStream createDataOutputStream() throws FileNotFoundException {
        return new DataOutputStream(
                new FileOutputStream("./sw11/src/main/resources/test.txt"));
    }

    private static TemperatureProgression getTemperatureProgression() {
        return new TemperatureProgression(Arrays.asList(
                new Measurement(
                        LocalDateTime.MAX,
                        Temperature.createFromCelsius(12.0),
                        Temperature.createFromCelsius(15.6)),
                new Measurement(
                        LocalDateTime.MIN,
                        Temperature.createFromCelsius(11.3),
                        Temperature.createFromCelsius(14.5))
        ));
    }
}