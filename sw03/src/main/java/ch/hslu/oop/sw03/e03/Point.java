package ch.hslu.oop.sw03.e03;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
}
