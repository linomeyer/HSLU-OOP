package ch.hslu.oop.sw10.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Car implements Switchable {
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);
    private final String model;
    private final Motor motor;
    private final Light light;

    public Car(String model, Motor motor, Light light) {
        this.model = model;
        this.motor = motor;
        this.motor.addPropertyChangeListener(event -> LOG.info("motor changed event: " +
                        "field: {}, " +
                        "oldvalue: {}, " +
                        "newValue: {}",
                event.getPropertyName(), event.getOldValue(), event.getNewValue()));
        this.light = light;
        this.light.addPropertyChangeListener(event -> LOG.info("light changed event: " +
                        "field: {}, " +
                        "oldvalue: {}, " +
                        "newValue: {}",
                event.getPropertyName(), event.getOldValue(), event.getNewValue()));
    }

    @Override
    public void switchOn() {
        motor.switchOn();
    }

    @Override
    public void switchOff() {
        motor.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return motor.isSwitchedOn();
    }

    @Override
    public boolean isSwitchedOff() {
        return motor.isSwitchedOff();
    }


    public Motor getMotor() {
        return motor;
    }

    public Light getLight() {
        return light;
    }

    public String getModel() {
        return model;
    }
}
