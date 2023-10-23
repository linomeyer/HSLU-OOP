package ch.hslu.oop.sw05.ex01;

public class Square extends Shape {
    private int length;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    public Square(int length) {
        this(0, 0, length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(final int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
