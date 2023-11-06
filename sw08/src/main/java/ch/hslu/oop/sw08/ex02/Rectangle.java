package ch.hslu.oop.sw08.ex02;

public final class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public void changeDimension(final int width, final int height) {
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
        return (2 * width) + (2 * height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
