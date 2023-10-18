package ch.hslu.oop.sw03.e01;

public class Demo {

    public void printBox(final int height, final int length) {
        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                printFullRow(length);
            } else {
                for (int j = 1; j <= length; j++) {
                    if (j == 1 || j == length) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }

    private void printFullRow(final int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
    }

    public void print0To10() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
    }

    public void iterativeAdditionUntil1() {
        float x = 0.9f;
        int i = 0;
        while (x < 1.0f) {
            x += 0.000025f;
            i++;
            System.out.println(i + "   " + x);
        }
    }

    public void iterativeAdditionUntil1WithForLoop() {
        float x = 0.9f;
        for (int i = 0; i < 4000; i++) {
            x += 0.000025;
            System.out.println(x);
        }
    }

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
