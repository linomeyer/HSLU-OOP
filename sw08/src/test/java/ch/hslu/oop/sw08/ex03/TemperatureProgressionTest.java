package ch.hslu.oop.sw08.ex03;

import ch.hslu.oop.sw08.ex01.Temperature;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TemperatureProgressionTest {
    @Test
    void addToTemperatureProgressionCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(new Temperature(45.75))));
        temperatureProgression.add(new Temperature(32.9));

        assertEquals(Arrays.asList(new Temperature(45.75), new Temperature(32.9)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionCollectionIfCollectionIsNull() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(null);
        temperatureProgression.add(new Temperature(32.9));

        assertEquals(List.of(new Temperature(32.9)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionCollectionIfCollectionIsEmpty() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(new ArrayList<>());
        temperatureProgression.add(new Temperature(37.2));

        assertEquals(List.of(new Temperature(37.2)),
                temperatureProgression.getTemperatures());
    }

    @Test
    void addToTemperatureProgressionWhenUsingTreeset() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(new TreeSet<>());
        temperatureProgression.add(new Temperature(37.2));

        assertEquals(new TreeSet<>(List.of(new Temperature(37.2))),
                temperatureProgression.getTemperatures());
    }

    @Test
    void clearTemperatureProgressionCollection() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(new Temperature(45.75), new Temperature(5.35))));

        temperatureProgression.clear();

        assertEquals(new ArrayList<>(), temperatureProgression.getTemperatures());
    }

    @Test
    void getMaxTemperatureOfTemperatureProgressionList() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(new Temperature(45.75), new Temperature(5.35))));

        assertEquals(new Temperature(45.75), temperatureProgression.getMaxTemperature());
    }

    @Test
    void getMinTemperatureOfTemperatureProgressionList() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(new Temperature(45.75), new Temperature(5.35))));

        assertEquals(new Temperature(5.35), temperatureProgression.getMinTemperature());
    }

    @Test
    void duplicateValuesAreNotAddable() {
        TemperatureProgression temperatureProgression = new TemperatureProgression(
                new ArrayList<>(List.of(new Temperature(45.75), new Temperature(45.75))));

        assertEquals(new Temperature(45.75), temperatureProgression.getMaxTemperature());
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
                new ArrayList<>(List.of(new Temperature(20), new Temperature(40))));

        assertEquals(new Temperature(30), temperatureProgression.getAverageTemperature());
    }
}