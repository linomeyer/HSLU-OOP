package ch.hslu.oop.sw06.ex03;

import ch.hslu.oop.sw06.ex03.car.Car;
import ch.hslu.oop.sw06.ex03.car.CountingSwitchable;
import ch.hslu.oop.sw06.ex03.car.Motor;
import ch.hslu.oop.sw06.ex03.car.Named;
import ch.hslu.oop.sw06.ex03.shapes.Circle;
import ch.hslu.oop.sw06.ex03.shapes.Rectangle;
import ch.hslu.oop.sw06.ex03.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // sw06 shapes
        Shape shape1 = new Circle(0, 0, 10);
        Shape shape2 = new Rectangle(0, 0, 5, 15);

        shape1.move(10, 10);

        System.out.println(((Circle) shape1).getDiameter());

        // sw06 car ************************************************************************************************

        Named named = new Car("Renault Twizzy", new Motor());
        System.out.println(named.getName());

        CountingSwitchable countingSwitchable = (Car) named;
        countingSwitchable.switchOn();
        countingSwitchable.switchOff();
        countingSwitchable.switchOn();
        System.out.println(countingSwitchable.getSwitchCount());
    }
}
