package homework11OOPAbstraction.HeatingSystem;

public class GasBoiler extends Boiler {
    public GasBoiler() {
        super("GBoil", "gas", 3.5, 20, 50);
    }

    @Override
    public int priceForGasPerWaterLiter() {
        return 80;
    }

    @Override
    public int priceForElectricityPerWaterLiter() {
        return 5;
    }
}
