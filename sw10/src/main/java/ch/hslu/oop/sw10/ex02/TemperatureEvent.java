package ch.hslu.oop.sw10.ex02;

import java.util.EventObject;

public class TemperatureEvent extends EventObject {
    private final TemperatureEventType type;
    private final Temperature addedTemperature;

    public TemperatureEvent(Object temperatureProgression, TemperatureEventType type, Temperature addedTemperature) {
        super(temperatureProgression);
        this.type = type;
        this.addedTemperature = addedTemperature;
    }

    public TemperatureEventType getType() {
        return type;
    }

    public Temperature getAddedTemperature() {
        return addedTemperature;
    }
}
