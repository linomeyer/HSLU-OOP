package ch.hslu.oop.sw06.ex02;

public class Main {
    public static void main(String[] args) {
        Element nitrogen = new Nitrogen(new Temperature(68));
        Element quicksilver = new Quicksilver(new Temperature(-45));

        System.out.println(nitrogen.toString());
        System.out.println(quicksilver.toString());
    }
}
