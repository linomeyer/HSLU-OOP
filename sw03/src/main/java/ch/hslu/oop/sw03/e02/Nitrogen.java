package ch.hslu.oop.sw03.e02;

public class Nitrogen extends Element {
    public Nitrogen(String name, Temperature temperature) {
        super(name, temperature);
    }

    @Override
    public AggregateState getAggregateState() {
        if (getTemperature().getTemperatureInCelcius() <= -209.86) {
            return AggregateState.SOLID;
        } else if (getTemperature().getTemperatureInCelcius() >= -195.79) {
            return AggregateState.GASEOUS;
        } else {
            return AggregateState.FLUID;
        }
    }
}
