package ch.hslu.oop.sw06.ex05;

public class CalculatorImpl implements Calculator {
    private static final int INTEGER_LIMIT = 2_147_483_647;

    @Override
    public int addition(int a, int b) throws IntegerOverflowException {
        long sumAsLong = (long) a + (long) b;
        if (sumAsLong > INTEGER_LIMIT || sumAsLong < -INTEGER_LIMIT) {
            throw new IntegerOverflowException("Integer Overflow!");
        }
        return a + b;
    }


}
