package homework11OOPAbstraction.transports;


abstract class Car extends Vehicle {
    protected Car(String energySource) {
        super(new Engine(), energySource);
    }

    protected Car(EnergyToMotionSystem motionSystem, String energySource) {
        super(motionSystem, energySource);
    }
}