package ch.hslu.oop.sw05.ex02;

public abstract class Element {
    private final String name;
    private Temperature temperature;

    protected Element(String name, Temperature temperature) {
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

    public void setTemperature(final Temperature temperature) {
        this.temperature = temperature;
    }
}
