package ch.hslu.oop.sw06.ex02;

public class Quicksilver extends Element {
    public Quicksilver(Temperature temperature) {
        super("Hg", temperature, new Temperature(-38.38), new Temperature(356.73));
    }

    @Override
    public String toString() {
        return super.toString() + " | ATTENTION: POISONOUS";
    }
}
