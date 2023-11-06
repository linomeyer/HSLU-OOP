package ch.hslu.oop.sw08.ex03;

import ch.hslu.oop.sw08.ex01.Temperature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.NoSuchElementException;

public class TemperatureProgression {
    private Collection<Temperature> temperatures;

    public TemperatureProgression(Collection<Temperature> temperatures) {
        if (temperatures == null) {
            temperatures = new ArrayList<>();
        }
        this.temperatures = temperatures;
    }

    public void add(Temperature temperature) {
        if (temperatures.contains(temperature)) {
            return;
        }
        Collections.addAll(temperatures, temperature);
    }

    public Collection<Temperature> getTemperatures() {
        return temperatures;
    }

    public void clear() {
        temperatures.clear();
    }

    public Temperature getMaxTemperature() throws NoSuchElementException {
        try {
            return Collections.max(temperatures);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the maximum value.");
        }
    }

    public Temperature getMinTemperature() throws NoSuchElementException {
        try {
            return Collections.min(temperatures);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the minimum value.");
        }
    }

    public Temperature getAverageTemperature() {
        return new Temperature(temperatures.stream().map(Temperature::getTemperatureInCelcius)
                .mapToDouble(Double::doubleValue).sum() / temperatures.size());

    }
}
