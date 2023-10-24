package ch.hslu.oop.sw06.ex03.car;

public class Car implements CountingSwitchable, Named {
    private final Motor motor;
    private String name;
    private int switchCount;

    public Car(String name, Motor motor) {
        this.name = name;
        this.motor = motor;
        switchCount = 0;
    }

    @Override
    public void switchOn() {
        if (motor.isSwitchedOff()) {
            motor.switchOn();
            switchCount++;
        }
    }

    @Override
    public void switchOff() {
        if (motor.isSwitchedOn()) {
            motor.switchOff();
            switchCount++;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return motor.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return motor.isSwitchedOff();
    }

    @Override
    public long getSwitchCount() {
        return switchCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Motor getMotor() {
        return motor;
    }
}
