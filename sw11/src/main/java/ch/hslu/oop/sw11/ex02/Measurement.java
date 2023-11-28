package ch.hslu.oop.sw11.ex02;

import ch.hslu.oop.sw11.temperature.Temperature;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Measurement {
    private final LocalDateTime timestamp;
    private final Temperature minTemp;
    private final Temperature maxTemp;

    public Measurement(LocalDateTime timestamp, Temperature minTemp, Temperature maxTemp) {
        this.timestamp = timestamp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public static Measurement createFromStrings(String timestampStr, String minStr, String maxStr) {
        LocalDateTime timestamp = LocalDateTime.parse(timestampStr,
                DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
        return new Measurement(timestamp, Temperature.createFromCelsius(Double.parseDouble(minStr)),
                Temperature.createFromCelsius(Double.parseDouble(maxStr)));
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Temperature getMinTemp() {
        return minTemp;
    }

    public Temperature getMaxTemp() {
        return maxTemp;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "timestamp=" + timestamp +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                '}';
    }
}
