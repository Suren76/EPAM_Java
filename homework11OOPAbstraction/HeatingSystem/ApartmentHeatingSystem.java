package homework11OOPAbstraction.HeatingSystem;

public class ApartmentHeatingSystem extends HeatingSystem{
    // <T extends Boiler> will be better
    public ApartmentHeatingSystem(Boiler boiler, double area) {
        super(boiler, "apartment", area);
        // set default days count
        monthUsesHeater = new DaysCounter("jun", 0);
    }

    @Override
    protected int getHeaterElementCount() {
        // added heater element per 25m²
        return (int) (area / 25);
    }

    @Override
    protected double getDailyUsedWaterAmountPerHeater() {
        return 6.5;
    }
}
