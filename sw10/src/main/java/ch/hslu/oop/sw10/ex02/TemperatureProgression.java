package ch.hslu.oop.sw10.ex02;

import java.text.MessageFormat;
import java.util.*;

public class TemperatureProgression {
    private final List<TemperatureAddListener> changeListeners;
    private final Collection<Temperature> temperatures;

    private Temperature minTemperature;
    private Temperature maxTemperature;

    public TemperatureProgression() {
        this(new ArrayList<>());
    }

    public TemperatureProgression(Collection<Temperature> temperatures) {
        changeListeners = new ArrayList<>();
        this.temperatures = temperatures;
    }

    public void add(Temperature temperature) {
        Collections.addAll(temperatures, temperature);
        fireTemperatureEventIfNewMaxOrMinValueIsAdded(temperature);
    }

    private void fireTemperatureEventIfNewMaxOrMinValueIsAdded(Temperature temperature) {
        if (isMaxTemperature(temperature)) {
            fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MAX, temperature));
        }
        if (isMinTemperature(temperature)) {
            fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MIN, temperature));
        }
    }

    private boolean isMinTemperature(Temperature temperature) {
        // Check if a minTemperature is already set
        if (minTemperature != null) {
            if (temperature.getTemperatureInCelsius() < minTemperature.getTemperatureInCelsius()) {
                minTemperature = temperature;
                return true;
            }
            return false;
            // If object was created with an already filled list, we need to determine the MinTemperature first
        } else if (temperatures.size() > 1) {
            minTemperature = getMinTemperature();
            return temperature.getTemperatureInCelsius() == minTemperature.getTemperatureInCelsius();
        }
        // Because this is the first temperature in the list, we can just make it the minTemperature
        minTemperature = temperature;
        return true;
    }

    private boolean isMaxTemperature(Temperature temperature) {
        if (maxTemperature != null) {
            if (temperature.getTemperatureInCelsius() > maxTemperature.getTemperatureInCelsius()) {
                maxTemperature = temperature;
                return true;
            }
            return false;
        } else if (temperatures.size() > 1) {
            minTemperature = getMinTemperature();
            return temperature.getTemperatureInCelsius() == maxTemperature.getTemperatureInCelsius();
        }
        maxTemperature = temperature;
        return true;
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
        if (temperatures.isEmpty()) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the average value");
        }
        return Temperature.createFromCelsius(temperatures
                .stream()
                .map(Temperature::getTemperatureInCelsius)
                .mapToDouble(Double::doubleValue).sum() / temperatures.size());
    }

    public void addTemperatureAddListener(final TemperatureAddListener listener) {
        if (listener != null) {
            this.changeListeners.add(listener);
        }
    }

    public void removeTemperatureAddListener(final TemperatureAddListener listener) {
        if (listener != null) {
            this.changeListeners.remove(listener);
        }
    }

    private void fireTemperatureEvent(final TemperatureEvent pcEvent) {
        for (final TemperatureAddListener listener : this.changeListeners) {
            listener.temperatureChange(pcEvent);
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("TemperatureProgression:\n " +
                        "\n\tCount of temperatures: {0}" +
                        "\n\tAverage temperature: {1}" +
                        "\n\tMinimum temperature: {2}" +
                        "\n\tMaximum temperature: {3}",
                temperatures.size(), getAverageTemperature(), getMinTemperature(), getMaxTemperature());
    }
}
