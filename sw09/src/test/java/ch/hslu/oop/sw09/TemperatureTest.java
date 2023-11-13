package ch.hslu.oop.sw09;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class TemperatureTest {
    @Test
    void throwExceptionIfTemperatureIsImpossible() {
        assertThatThrownBy(() -> Temperature.createFromKelvin(-5.25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("This temperature is not physically possible.");
    }
}