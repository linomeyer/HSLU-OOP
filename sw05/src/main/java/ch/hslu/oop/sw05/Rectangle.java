package ch.hslu.oop.sw05;

public final class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * getX() + 2 * getY();
    }

    @Override
    public double getArea() {
        return getX() * getY();
    }
}
