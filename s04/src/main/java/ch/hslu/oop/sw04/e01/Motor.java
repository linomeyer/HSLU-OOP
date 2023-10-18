package ch.hslu.oop.sw04.e01;

public class Motor implements Switchable {
    private int rpm;

    public Motor(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public void switchOn() {
        rpm = 1000;
    }

    @Override
    public void switchOff() {
        rpm = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return rpm == 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(final int rpm) {
        this.rpm = rpm;
    }
}
