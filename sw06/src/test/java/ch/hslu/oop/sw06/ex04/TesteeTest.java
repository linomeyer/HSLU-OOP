package ch.hslu.oop.sw06.ex04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteeTest {

    @Test
    void max_ShouldReturnFirstNumberAsMax_WhenFirstNumberIsLargest() {
        // Given | Arrange
        int a = 5;
        int b = 3;
        int c = -7;

        // When | Act
        int max = Testee.maxOfThree(a, b, c);

        // Then | Assert
        assertEquals(a, max);
    }

    @Test
    void max_ShouldReturnSecondNumberAsMax_WhenSecondNumberIsLargest() {
        int a = 7;
        int b = 130;
        int c = 129;

        int max = Testee.maxOfThree(a, b, c);

        assertEquals(b, max);
    }

    @Test
    void max_ShouldReturnSecondNumberAsMax_WhenThirdNumberIsLargest() {
        int a = -100;
        int b = 678;
        int c = 945;

        int max = Testee.maxOfThree(a, b, c);

        assertEquals(b, max);
    }

    @Test
    void max_ShouldReturnTheNumber_WhenAllNumbersAreTheSameSize() {
        int a = 5;
        int b = 5;
        int c = 5;

        assertEquals(a, Testee.maxOfThree(a, b, c));
    }
}