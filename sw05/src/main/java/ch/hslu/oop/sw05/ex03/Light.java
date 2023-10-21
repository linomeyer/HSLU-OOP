package ch.hslu.oop.sw05.ex03;

public class Light implements Switchable {
    private boolean lightState;

    public Light(boolean lightState) {
        this.lightState = lightState;
    }

    @Override
    public void switchOn() {
        lightState = true;
    }

    @Override
    public void switchOff() {
        lightState = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return lightState;
    }

    @Override
    public boolean isSwitchedOff() {
        return lightState;
    }
}
