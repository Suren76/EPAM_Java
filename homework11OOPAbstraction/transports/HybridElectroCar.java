package homework11OOPAbstraction.transports;

public class HybridElectroCar extends Car {
    Hybrid motionSystem;

    public HybridElectroCar() {
        super(new Engine(), "electricity");
    }

    public void switchToDiesel() {
        energySource = "diesel";
    }
}
