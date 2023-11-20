package ch.hslu.oop.sw10.ex01;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {
    private final List<PropertyChangeListener> changeListeners;
    private int rpm;
    private State state;

    public Motor() {
        this(State.OFF, 0);
    }

    public Motor(State state) {
        this(state, 0);
    }

    public Motor(State state, int rpm) {
        changeListeners = new ArrayList<>();
        this.state = state;
        this.rpm = rpm;
    }

    @Override
    public void switchOn() {
        if (state.equals(State.OFF)) {
            state = State.ON;
            firePropertyChangeEvent(new PropertyChangeEvent(this, "state", false, true));
        }
    }

    @Override
    public void switchOff() {
        if (state.equals(State.ON)) {
            state = State.OFF;
            firePropertyChangeEvent(new PropertyChangeEvent(this, "state", true, false));
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return state.equals(State.ON);
    }

    @Override
    public boolean isSwitchedOff() {
        return state.equals(State.OFF);
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(final int rpm) {
        if (rpm != this.rpm) {
            firePropertyChangeEvent(new PropertyChangeEvent(this, "rpm", this.rpm, rpm));
            this.rpm = rpm;
        }
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListeners.add(listener);
        }
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListeners.remove(listener);
        }
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }
}
