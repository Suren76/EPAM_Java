package homework11OOPAbstraction.transports;

public class DieselMotorCar extends FuelMotorCar implements GasMountInterface {
    Engine motionSystem;

    public DieselMotorCar() {
        super("diesel");
    }

    @Override
    public void switchToGas() {
        energySource = "gas";
    }

    public void switchToDiesel() {
        energySource = "diesel";
    }

    @Override
    public String getVehicleType() {
        return "Diesel Motor Car";
    }
}
