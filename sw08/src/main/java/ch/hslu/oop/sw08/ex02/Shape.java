package ch.hslu.oop.sw08.ex02;

/**
 * Representation of a geometrical shape.
 * Holds 2 variables {@code x} and {@code y} that represent the coordinates of the shape.
 */
public abstract class Shape {
    private int x;
    private int y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    /**
     * @return Perimeter of the geometrical shape
     */
    public abstract double getPerimeter();

    /**
     * @return Area of the geometrical shape
     */
    public abstract double getArea();
}
