package ch.hslu.oop.sw10.ex02;

import java.text.MessageFormat;
import java.util.*;

public class TemperatureProgression {
    private final List<TemperatureAddListener> changeListeners;
    private final Collection<Temperature> temperatures;

    public TemperatureProgression() {
        this(null);
    }

    public TemperatureProgression(Collection<Temperature> temperatures) {
        changeListeners = new ArrayList<>();

        if (temperatures == null) {
            temperatures = new ArrayList<>();
        }
        this.temperatures = temperatures;
    }

    public void add(Temperature temperature) {
        if (temperatures.contains(temperature)) {
            return;
        }
        fireTemperatureEventIfNewMaxOrMinValueIsAdded(temperature);

        Collections.addAll(temperatures, temperature);
    }

    private void fireTemperatureEventIfNewMaxOrMinValueIsAdded(Temperature temperature) {
        if (!temperatures.isEmpty()) {
            if (isMaxTemperature(temperature)) {
                fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MAX, temperature));
            } else if (isMinTemperature(temperature)) {
                fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MIN, temperature));
            }
        }
    }

    private boolean isMinTemperature(Temperature temperature) {
        return temperature.getTemperatureInCelcius() < getMinTemperature().getTemperatureInCelcius();
    }

    private boolean isMaxTemperature(Temperature temperature) {
        return temperature.getTemperatureInCelcius() > getMaxTemperature().getTemperatureInCelcius();
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
                .map(Temperature::getTemperatureInCelcius)
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
