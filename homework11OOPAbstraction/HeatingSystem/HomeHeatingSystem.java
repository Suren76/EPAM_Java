package homework11OOPAbstraction.HeatingSystem;

public class HomeHeatingSystem extends HeatingSystem {
    public HomeHeatingSystem(Boiler boiler, double area) {
        super(boiler, "home", area);
        // set default days count
        monthUsesHeater = new DaysCounter("jun", 0);
    }

    @Override
    protected int getHeaterElementCount() {
        // added heater element per 30m²
        return (int) (area / 30);
    }

    @Override
    protected double getDailyUsedWaterAmountPerHeater() {
        return 9.5;
    }
}
