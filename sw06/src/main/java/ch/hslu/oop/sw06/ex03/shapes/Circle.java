package ch.hslu.oop.sw06.ex03.shapes;

import static java.lang.Math.PI;

public final class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public Circle(int diameter) {
        this(0, 0, diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * {@inheritDoc}
     *
     * @return the value rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return Math.round((2 * diameter * PI) * 100) / 100.0;
    }

    /**
     * {@inheritDoc}
     *
     * @return the value rounded to two decimal places
     */
    @Override
    public double getArea() {
        return Math.round((diameter * diameter * PI) * 100) / 100.0;
    }
}
