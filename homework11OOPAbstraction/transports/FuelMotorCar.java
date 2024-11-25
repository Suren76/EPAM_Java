package homework11OOPAbstraction.transports;

public class FuelMotorCar extends Car {
    Engine motionSystem;

    public FuelMotorCar() {
        super(new Engine(), "gas");
    }
}
