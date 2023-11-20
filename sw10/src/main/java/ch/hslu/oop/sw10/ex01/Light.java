package ch.hslu.oop.sw10.ex01;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Light implements Switchable {
    private final List<PropertyChangeListener> changeListeners;
    private State state;

    public Light() {
        this(State.OFF);
    }

    public Light(State state) {
        changeListeners = new ArrayList<>();
        this.state = state;
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

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }
}
