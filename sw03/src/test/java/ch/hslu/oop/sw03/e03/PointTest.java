package ch.hslu.oop.sw03.e03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    @Test
    void testPointGetQuadrant() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(-3, 7);
        Point point3 = new Point(-1, -6);
        Point point4 = new Point(5, -2);

        assertEquals(1, point1.getQuadrant());
        assertEquals(2, point2.getQuadrant());
        assertEquals(3, point3.getQuadrant());
        assertEquals(4, point4.getQuadrant());
    }
}