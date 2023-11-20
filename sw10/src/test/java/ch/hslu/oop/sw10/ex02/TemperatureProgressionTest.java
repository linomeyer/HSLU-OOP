package ch.hslu.oop.sw10.ex02;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TemperatureProgressionTest {
    @Test
    void addToTemperatureProgressionCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(45.75))));
        temperatureProgression.add(Temperature.createFromCelsius(32.9));

        assertEquals(Arrays.asList(Temperature.createFromCelsius(45.75), Temperature.createFromCelsius(32.9)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionCollectionIfCollectionIsNull() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(null);
        temperatureProgression.add(Temperature.createFromCelsius(32.9));

        assertEquals(List.of(Temperature.createFromCelsius(32.9)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionCollectionIfCollectionIsEmpty() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(new ArrayList<>());
        temperatureProgression.add(Temperature.createFromCelsius(37.2));

        assertEquals(List.of(Temperature.createFromCelsius(37.2)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionWhenUsingTreeset() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(new TreeSet<>());
        temperatureProgression.add(Temperature.createFromCelsius(37.2));

        assertEquals(new TreeSet<>(List.of(Temperature.createFromCelsius(37.2))),
                temperatureProgression.getTemperatures());
    }

    @Test
    void clearTemperatureProgressionCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(45.75), Temperature.createFromCelsius(5.35))));

        temperatureProgression.clear();

        assertEquals(new ArrayList<>(), temperatureProgression.getTemperatures());
    }

    @Test
    void getMaxTemperatureOfTemperatureProgressionList() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(45.75), Temperature.createFromCelsius(5.35))));

        assertEquals(Temperature.createFromCelsius(45.75), temperatureProgression.getMaxTemperature());
    }

    @Test
    void getMinTemperatureOfTemperatureProgressionList() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(45.75), Temperature.createFromCelsius(5.35))));

        assertEquals(Temperature.createFromCelsius(5.35), temperatureProgression.getMinTemperature());
    }

    @Test
    void duplicateValuesAreNotAddable() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(45.75))));

        temperatureProgression.add(Temperature.createFromCelsius(45.75));

        assertEquals(Temperature.createFromCelsius(45.75), temperatureProgression.getMaxTemperature());
        assertEquals(1, temperatureProgression.getTemperatures().size());
    }

    @Test
    void getMaxValueIfNoValuesAreInCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(null);

        assertThrows(NoSuchElementException.class, temperatureProgression::getMaxTemperature);
    }

    @Test
    void getMinValueIfNoValuesAreInCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(null);

        assertThrows(NoSuchElementException.class, temperatureProgression::getMinTemperature);
    }

    @Test
    void getAverageTemperatureOfCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(Temperature.createFromCelsius(20), Temperature.createFromCelsius(40))));

        assertEquals(Temperature.createFromCelsius(30), temperatureProgression.getAverageTemperature());
    }

    @Test
    void getAverageTemperatureIfNoValuesAreInCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(null);

        assertThrows(NoSuchElementException.class, temperatureProgression::getAverageTemperature);
    }
}