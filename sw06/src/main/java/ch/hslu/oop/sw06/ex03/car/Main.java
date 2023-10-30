package ch.hslu.oop.sw06.ex03.car;

public class Main {
    public static void main(String[] args) {
        Named named = new Car("Renault Twizzy", new Motor());
        System.out.println(named.getName());

        CountingSwitchable countingSwitchable = (Car) named;
        countingSwitchable.switchOn();
        countingSwitchable.switchOff();
        countingSwitchable.switchOn();
        System.out.println(countingSwitchable.getSwitchCount());
        System.out.println("CountingSwitchable isSwitchedOn? " + countingSwitchable.isSwitchedOn());

        Switchable switchable = countingSwitchable;
        switchable.switchOff();
        System.out.println("CountingSwitchable isSwitchedOn? " + countingSwitchable.isSwitchedOn());
        System.out.println("Switchable isSwitchedOn? " + switchable.isSwitchedOn());
    }
}
