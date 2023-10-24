package ch.hslu.oop.sw06.ex03.car;

public class Motor implements CountingSwitchable {
    private int rpm;
    private int switchCounter;

    public Motor() {
        switchCounter = 0;
        rpm = 0;
    }

    public Motor(int rpm) {
        switchCounter = 0;
        this.rpm = rpm;
    }

    @Override
    public void switchOn() {
        if (isSwitchedOff()) {
            switchCounter++;
            rpm = 1000;
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            switchCounter++;
            rpm = 0;
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return rpm == 0;
    }

    @Override
    public long getSwitchCount() {
        return switchCounter;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(final int rpm) {
        this.rpm = rpm;
    }
}
