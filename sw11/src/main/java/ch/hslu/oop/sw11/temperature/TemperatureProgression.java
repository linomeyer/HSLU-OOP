package ch.hslu.oop.sw11.temperature;

import ch.hslu.oop.sw11.ex02.Measurement;

import java.text.MessageFormat;
import java.util.*;

public class TemperatureProgression {
    private final List<TemperatureAddListener> changeListeners;
    private final Collection<Measurement> measurements;

    private Temperature minTemperature;
    private Temperature maxTemperature;

    public TemperatureProgression() {
        this(new ArrayList<>());
    }

    public TemperatureProgression(Collection<Measurement> measurements) {
        changeListeners = new ArrayList<>();
        this.measurements = measurements;
    }

    public void add(Measurement measurement) {
        Collections.addAll(measurements, measurement);
        fireTemperatureEventIfNewMaxOrMinValueIsAdded(measurement);
    }

    private void fireTemperatureEventIfNewMaxOrMinValueIsAdded(Measurement measurement) {
        if (isMaxTemperature(measurement.getMaxTemp())) {
            fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MAX, measurement.getMaxTemp()));
        }
        if (isMinTemperature(measurement.getMinTemp())) {
            fireTemperatureEvent(new TemperatureEvent(this, TemperatureEventType.MIN, measurement.getMinTemp()));
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
        } else if (measurements.size() > 1) {
            minTemperature = getMinTemperature().getMaxTemp();
            return temperature.getTemperatureInCelsius() <= minTemperature.getTemperatureInCelsius();
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
        } else if (measurements.size() > 1) {
            minTemperature = getMinTemperature().getMinTemp();
            return temperature.getTemperatureInCelsius() >= maxTemperature.getTemperatureInCelsius();
        }
        maxTemperature = temperature;
        return true;
    }

    public Collection<Measurement> getMeasurements() {
        return measurements;
    }

    public void clear() {
        measurements.clear();
    }

    public Measurement getMaxTemperature() throws NoSuchElementException {
        try {
            return measurements.stream().max(Comparator.comparing(Measurement::getMaxTemp)).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the maximum value.");
        }
    }

    public Measurement getMinTemperature() throws NoSuchElementException {
        try {
            return measurements.stream().min(Comparator.comparing(Measurement::getMinTemp)).orElseThrow();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the minimum value.");
        }
    }

    public Temperature getAverageTemperature() {
        if (measurements.isEmpty()) {
            throw new NoSuchElementException("Collection needs at least 1 Element to determine the average value");
        }
        return Temperature.createFromCelsius(getAllTemperatures()
                .stream()
                .map(Temperature::getTemperatureInCelsius)
                .mapToDouble(Double::doubleValue).sum() / measurements.size());
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

    private List<Temperature> getAllTemperatures() {
        List<Temperature> temperatures = new ArrayList<>();
        measurements.forEach(measurement -> {
            temperatures.add(measurement.getMinTemp());
            temperatures.add(measurement.getMaxTemp());
        });
        return temperatures;
    }

    @Override
    public String toString() {
        return MessageFormat.format("TemperatureProgression:\n " +
                        "\n\tCount of temperatures: {0}" +
                        "\n\tAverage temperature: {1}" +
                        "\n\tMinimum temperature: {2}" +
                        "\n\tMaximum temperature: {3}",
                measurements.size(), getAverageTemperature(), getMinTemperature(), getMaxTemperature());
    }
}
