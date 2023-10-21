package ch.hslu.oop.sw04.e01;

public class Car implements Switchable{
    private boolean state;
    private Motor motor;
    private Light light;
    private AirCondition airCondition;

    public Car(boolean state, Motor motor, Light light, AirCondition airCondition) {
        this.state = state;
        this.motor = motor;
        this.light = light;
        this.airCondition = airCondition;
    }

    @Override
    public void switchOn() {
        state = true;
    }

    @Override
    public void switchOff() {
        motor.switchOff();
        light.switchOff();
        airCondition.switchOff();
        state = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return state;
    }

    @Override
    public boolean isSwitchedOff() {
        return state;
    }

    public Motor getMotor() {
        return motor;
    }

    public Light getLight() {
        return light;
    }

    public AirCondition getAirCondition() {
        return airCondition;
    }
}
