package ch.hslu.oop.sw05;

public abstract class Shape {
    private int x;
    private int y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
