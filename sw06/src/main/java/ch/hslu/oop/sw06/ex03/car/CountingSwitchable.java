package ch.hslu.oop.sw06.ex03.car;

/**
 * This interface is an extension of the {@link Switchable} interface.
 * It additionally allows you to count how many times there has been a switch.
 */
public interface CountingSwitchable extends Switchable {
    /**
     * @return how often the methods {@code switchOn} and {@code switchOff} got called
     */
    long getSwitchCount();
}
