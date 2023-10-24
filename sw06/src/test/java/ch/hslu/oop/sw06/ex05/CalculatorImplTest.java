package ch.hslu.oop.sw06.ex05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorImplTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    void addition_ShouldReturnAddition_WhenTwoPositiveNumbersAreGiven() throws Exception {
        int a = 7;
        int b = 10;

        int result = calculator.addition(a, b);

        assertEquals(17, result);
    }

    @Test
    void addition_ShouldReturnAddition_WhenAPositiveAndANegativeNumberIsGiven() throws Exception {
        int a = -7;
        int b = 10;

        int result = calculator.addition(a, b);

        assertEquals(3, result);
    }

    @Test
    void addition_ShouldReturnAddition_WhenTwoNegativeNumbersAreGiven() throws Exception {
        int a = -9;
        int b = -18;

        int result = calculator.addition(a, b);

        assertEquals(-27, result);
    }

    @Test
    void addition_ThrowArithmeticException_WhenAdditionOfPositiveNumbersOverflowInteger() {
        int a = 2_147_483_610;
        int b = 150;

        assertThrows(IntegerOverflowException.class, () -> calculator.addition(a, b));
    }

    @Test
    void addition_ThrowArithmeticException_WhenAdditionOfNegativeNumbersOverflowInteger() {
        int a = -300;
        int b = -2_147_483_630;

        assertThrows(IntegerOverflowException.class, () -> calculator.addition(a, b));
    }
}