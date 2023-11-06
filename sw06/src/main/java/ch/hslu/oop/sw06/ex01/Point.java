package ch.hslu.oop.sw06.ex01;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.x, point.y);
    }

    /**
     * Moves point by given values on the x- and y-axis
     *
     * @param xIntercept value by which the point moves on the x-axis
     * @param yIntercept value by which the point moves on the y-axis
     */
    public void moveRelativeCartesian(int xIntercept, int yIntercept) {
        this.x += xIntercept;
        this.y += yIntercept;
    }

    public void moveRelativeCartesian(Point point) {
        this.moveRelativeCartesian(point.getX(), point.getY());
    }

    /**
     * Move Point by angle and distance relative to the location the end point.
     *
     * @param angle    angle from Point to the location it will be moved to
     * @param distance distance from Point to the location it will be moved to
     */
    public void moveRelativePolar(double angle, int distance) {
        int yIntercept = Math.toIntExact(Math.round(distance / Math.sin(Math.toRadians(angle))));
        int xIntercept = Math.toIntExact(Math.round(distance / Math.cos(Math.toRadians(angle))));

        moveRelativeCartesian(xIntercept, yIntercept);
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
        return String.format("Point[x=%s, y=%s]", x, y);
    }
}
