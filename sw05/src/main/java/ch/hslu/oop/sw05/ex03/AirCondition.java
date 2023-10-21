package ch.hslu.oop.sw05.ex03;

public class AirCondition implements Switchable {
    private boolean state;
    private int intensity;

    public AirCondition(boolean state) {
        this.state = state;
        this.intensity = 0;
    }

    public AirCondition(int intensity) {
        this.state = false;
        this.intensity = intensity;
    }

    public AirCondition(boolean state, int intensity) {
        this.state = state;
        this.intensity = intensity;
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

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(final int intensity) {
        this.intensity = intensity;
    }
}
