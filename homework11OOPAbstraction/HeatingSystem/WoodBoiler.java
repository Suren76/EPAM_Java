package homework11OOPAbstraction.HeatingSystem;

public class WoodBoiler extends Boiler {
    public WoodBoiler() {
        super("WBoil", "wood", 5.5, 5, 95);
    }

    @Override
    public int priceForGasPerWaterLiter() {
        return 65;
    }

    @Override
    public int priceForElectricityPerWaterLiter() {
        return 0;
    }
}
