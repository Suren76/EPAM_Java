package homework11OOPAbstraction.transports;

abstract class FuelMotorCar extends Car {
    Engine motionSystem;

    protected FuelMotorCar(String energySource) {
        super(energySource);
    }
}
