package homework11OOPAbstraction.transports;

public class MotorCycle extends Vehicle {
    Engine motionSystem;

    protected MotorCycle() {
        super(new Engine(), "diesel");
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}
