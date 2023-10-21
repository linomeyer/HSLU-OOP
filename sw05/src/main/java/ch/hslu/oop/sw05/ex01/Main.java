package ch.hslu.oop.sw05.ex01;

public class Main {
    public static void main(String[] args) {
        // Rectangle
        Rectangle rectangle = new Rectangle(30, 50, 10, 20);
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Coordinates of rectangle: " + rectangle.getX() + ", " + rectangle.getY());
        System.out.println();

        // Circle
        Circle circle = new Circle(10);
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println();

        // Square
        Square square = new Square(30);
        System.out.println("Perimeter of square: " + square.getPerimeter());
        System.out.println("Area of square: " + square.getArea());
    }
}
