package homework11OOPAbstraction.transports;


abstract class Car extends Vehicle{
    public Car(EnergyToMotionSystem motionSystem, String energySource) {
        super(motionSystem, energySource);
    }
}

