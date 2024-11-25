package homework11OOPAbstraction.transports;

public class DieselMotorCar extends Car implements FuelMountInterface {
    Engine motionSystem;

    public DieselMotorCar() {
        super(new Engine(), "diesel");
    }

    @Override
    public void switchToGas() {
        energySource = "gas";
    }
}
