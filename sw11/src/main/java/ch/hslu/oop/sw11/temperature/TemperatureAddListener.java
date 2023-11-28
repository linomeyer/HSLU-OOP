package ch.hslu.oop.sw11.temperature;

import java.util.EventListener;

public interface TemperatureAddListener extends EventListener {

    /**
     * This method can be called when a temperature is added on a bound property.
     *
     * @param event - A TemperatureEvent object describing the event source and the temperature that was added.
     */
    void temperatureChange(TemperatureEvent event);
}
