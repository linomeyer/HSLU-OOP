package ch.hslu.oop.sw11.ex02;

import ch.hslu.oop.sw11.temperature.TemperatureProgression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        if (new File("./sw11/src/main/resources/temperatures.csv").exists()) {
            try (BufferedReader br = createFileReader("./sw11/src/main/resources/temperatures.csv")) {
                TemperatureProgression temperatureProgression = new TemperatureProgression(
                        br.lines()
                                .map(line -> line.split(";"))
                                .map(line -> Measurement.createFromStrings(line[1], line[2], line[3])).toList());

                System.out.println("Average Temperature" + temperatureProgression.getAverageTemperature());
                System.out.println("Minimum Temperature" + temperatureProgression.getMinTemperature());
                System.out.println("Maximum Temperature" + temperatureProgression.getMaxTemperature());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static BufferedReader createFileReader(String path) throws IOException {
        return new BufferedReader(
                new InputStreamReader(new FileInputStream(path),
                        StandardCharsets.UTF_8));
    }
}


