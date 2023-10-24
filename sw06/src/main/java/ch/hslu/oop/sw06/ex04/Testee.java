package ch.hslu.oop.sw06.ex04;

public class Testee {
    private Testee() {
        // prevent instantiation
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maxOfThree(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
