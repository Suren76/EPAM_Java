package homework11OOPAbstraction.transports;

public class HybridElectroCar extends Car {
    Hybrid motionSystem;

    public HybridElectroCar() {
        super(new Hybrid(), "electricity");
    }

    public void switchToDiesel() {
        setEnergySource("diesel");
    }

    public void switchToElectricity() {
        setEnergySource("electricity");
    }

    @Override
    public String getVehicleType() {
        return "Hybrid Electro Car";
    }
}
