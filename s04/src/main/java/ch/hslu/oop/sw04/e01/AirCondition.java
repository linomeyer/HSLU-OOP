package ch.hslu.oop.sw04.e01;

public class AirCondition implements Switchable {
    private boolean state;

    public AirCondition(boolean state) {
        this.state = state;
    }

    @Override
    public void switchOn() {
        state = true;
    }

    @Override
    public void switchOff() {
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
}
