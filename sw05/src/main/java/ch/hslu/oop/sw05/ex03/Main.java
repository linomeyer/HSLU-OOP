package ch.hslu.oop.sw05.ex03;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.switchOn();
        motor.switchOff();
        motor.switchOn();
        motor.switchOff();

        System.out.println("Switch count of motor: " + motor.getSwitchCount());
    }
}