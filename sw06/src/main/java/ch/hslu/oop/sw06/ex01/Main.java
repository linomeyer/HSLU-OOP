package ch.hslu.oop.sw06.ex01;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 5);

        point.moveRelative(45.0, 2);
        System.out.println(point);
    }
}