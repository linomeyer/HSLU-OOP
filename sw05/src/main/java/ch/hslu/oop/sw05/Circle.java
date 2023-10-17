package ch.hslu.oop.sw05;

import static java.lang.Math.PI;

public final class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }


    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    /**
     * @return Perimeter of circle rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return Math.round((2 * diameter * PI) * 100) / 100.0;
    }

    /**
     * @return Area of circle rounded to two decimal places
     */
    @Override
    public double getArea() {
        return Math.round((diameter * diameter * PI) * 100) / 100.0;
    }
}
