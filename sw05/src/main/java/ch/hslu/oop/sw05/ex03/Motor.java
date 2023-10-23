package ch.hslu.oop.sw05.ex03;

public class Motor implements CountingSwitchable, Named {
    private String name;
    private int rpm;
    private int switchCounter;

    public Motor(String name) {
        this.name = name;
        switchCounter = 0;
        rpm = 0;
    }

    public Motor(String name, int rpm) {
        this.name = name;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(final int rpm) {
        this.rpm = rpm;
    }
}
