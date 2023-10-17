package ch.hslu.oop.sw03.e01;

public class Demo {

    public int max1(int a, int b) {
        return Math.max(a, b);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max1(int a, int b, int c) {
        int maxAb = max1(a, b);
        return max1(maxAb, c);
    }

    public int max2(int a, int b, int c) {
        int maxAb;
        if (a > b) {
            maxAb = a;
        } else {
            maxAb = b;
        }
        if (maxAb > c) {
            return maxAb;
        } else {
            return c;
        }
    }
}
