package homework11OOPAbstraction.HeatingSystem;

public class ElectricBoiler extends Boiler {
    public ElectricBoiler() {
        super("EBoil", "electro", 1.5, 30, 30);
    }

    @Override
    public int priceForGasPerWaterLiter() {
        return 0;
    }

    @Override
    public int priceForElectricityPerWaterLiter() {
        return 100;
    }
}
