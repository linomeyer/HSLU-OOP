package ch.hslu.oop.sw06.ex03.car;

/**
 * This interface is used to check if things are on or off and switch things on or off
 */
public interface Switchable {
    /**
     * Switch something on
     */
    void switchOn();

    /**
     * Switch something on
     */
    void switchOff();

    /**
     * Check if something is switched on
     *
     * @return true if switched on
     */
    boolean isSwitchedOn();

    /**
     * Check if something is switched off
     *
     * @return true if switched off
     */
    boolean isSwitchedOff();
}
