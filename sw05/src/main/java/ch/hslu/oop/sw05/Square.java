package ch.hslu.oop.sw05;

public class Square extends Shape {
    private int length;

    protected Square(int x, int y, int length) {
        super(x, y);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
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
