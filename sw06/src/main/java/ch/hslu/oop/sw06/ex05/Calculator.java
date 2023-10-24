package ch.hslu.oop.sw06.ex05;

/**
 * This interface allows the implementation of simple calculator that adds 2 numbers.
 */
public interface Calculator {
    /**
     * This method adds 2 numbers
     *
     * @param a first number
     * @param b second number
     * @return result of the addition
     */
    int addition(int a, int b) throws IntegerOverflowException;
}
