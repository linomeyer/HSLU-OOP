package ch.hslu.oop.sw05.ex02;

public class Quicksilver extends Element {
    public Quicksilver(Temperature temperature) {
        super("Hg", temperature);
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
