package ch.hslu.oop.sw03.e01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void testMax1OfThreeNumber() {
        Demo demo = new Demo();

        int example1 = demo.max1(3, 7, 6);
        int example2 = demo.max1(8, 4, 2);
        int example3 = demo.max1(5, 3, 9);

        assertEquals(7, example1);
        assertEquals(8, example2);
        assertEquals(9, example3);
    }

    void testMax2OfThreeNumber() {
        Demo demo = new Demo();

        int example1 = demo.max2(3, 7, 6);
        int example2 = demo.max2(8, 4, 2);
        int example3 = demo.max2(5, 3, 9);

        assertEquals(7, example1);
        assertEquals(8, example2);
        assertEquals(9, example3);
    }
}