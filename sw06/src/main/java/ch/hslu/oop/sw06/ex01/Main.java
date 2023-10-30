package ch.hslu.oop.sw06.ex01;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        Point point2 = new Point(point);
        Point point3 = new Point(point2);

        point.moveRelative(new Point(3, 3));
        System.out.println(point);

        point2.moveRelative(1, 2);
        System.out.println(point2);

        point3.moveRelative(45.0, 2);
        System.out.println(point3);

    }
}