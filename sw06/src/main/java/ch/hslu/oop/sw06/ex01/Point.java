package ch.hslu.oop.sw06.ex01;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    /**
     * Moves point by given values on the x- and y-axis
     *
     * @param xIntercept value by which the point moves on the x-axis
     * @param yIntercept value by which the point moves on the y-axis
     */
    public void moveRelative(int xIntercept, int yIntercept) {
        x += xIntercept;
        y += yIntercept;
    }

    public void moveRelative(Point point) {
        moveRelative(point.getX(), point.getY());
    }

    public void moveRelative(double angle, int amount) {
        int y = this.y + Math.toIntExact(Math.round(amount / Math.sin(Math.toRadians(angle))));
        int x = this.x + Math.toIntExact(Math.round(amount / Math.cos(Math.toRadians(angle))));

        moveRelative(x, y);
    }

    public int getQuadrant() {
        if (x >= 0) {
            if (y >= 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y >= 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("Class Point: [x: %s y: %s]", x, y);
    }
}
