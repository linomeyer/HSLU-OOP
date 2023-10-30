package ch.hslu.oop.sw06.ex03.shapes;

public class Main {
    public static void main(String[] args) {
        // sw06 shapes
        Shape shape1 = new Circle(0, 0, 10);
        Shape shape2 = new Rectangle(0, 0, 5, 15);

        shape1.move(10, 10);

        System.out.println(((Circle) shape1).getDiameter());
    }
}
