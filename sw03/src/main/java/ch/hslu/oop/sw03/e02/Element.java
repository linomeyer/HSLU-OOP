package ch.hslu.oop.sw03.e02;

public abstract class Element {
    private final String name;
    private final Temperature temperature;

    public Element(String name, Temperature temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public abstract AggregateState getAggregateState();

    public String getName() {
        return name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

}
