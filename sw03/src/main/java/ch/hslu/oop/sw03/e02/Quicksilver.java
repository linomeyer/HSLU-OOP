package ch.hslu.oop.sw03.e02;

public class Quicksilver extends Element {
    public Quicksilver(String element, Temperature temperature) {
        super(element, temperature);
    }

    @Override
    public AggregateState getAggregateState() {
        if (getTemperature().getTemperatureInCelcius() <= -38.38) {
            return AggregateState.SOLID;
        } else if (getTemperature().getTemperatureInCelcius() >= 356.73) {
            return AggregateState.GASEOUS;
        } else {
            return AggregateState.FLUID;
        }
    }
}
