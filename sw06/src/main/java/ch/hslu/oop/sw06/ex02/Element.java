package ch.hslu.oop.sw06.ex02;

public abstract class Element {
    private final String name;
    private final Temperature meltingTemperature;
    private final Temperature boilingTemperature;
    private Temperature temperature;

    protected Element(String name, Temperature temperature, Temperature meltingTemperature, Temperature boilingTemperature) {
        this.name = name;
        this.temperature = temperature;
        this.meltingTemperature = meltingTemperature;
        this.boilingTemperature = boilingTemperature;
    }

    public final AggregateState getAggregateState() {
        if (getTemperature().getTemperatureInCelcius() <= meltingTemperature.getTemperatureInCelcius()) {
            return AggregateState.SOLID;
        } else if (getTemperature().getTemperatureInCelcius() >= boilingTemperature.getTemperatureInCelcius()) {
            return AggregateState.GASEOUS;
        } else {
            return AggregateState.FLUID;
        }
    }

    public String getName() {
        return name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(final Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Element {" +
                "name='" + name + '\'' +
                ", meltingTemperature=" + meltingTemperature.toString() +
                ", boilingTemperature=" + boilingTemperature.toString() +
                ", temperature=" + temperature.toString() +
                '}';
    }
}
