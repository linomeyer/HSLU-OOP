package ch.hslu.oop.sw05.ex02;

public class Nitrogen extends Element {
    public Nitrogen(Temperature temperature) {
        super("N", temperature);
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
