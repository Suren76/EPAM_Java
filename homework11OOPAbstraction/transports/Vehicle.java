package homework11OOPAbstraction.transports;

abstract class Vehicle {
    protected EnergyToMotionSystem motionSystem;
    protected String energySource;

    protected Vehicle(EnergyToMotionSystem motionSystem, String energySource) {
        this.motionSystem = motionSystem;
        this.energySource = energySource;
    }

    public void start() {
        motionSystem.start();
    }

    public String getEnergySource() {
        if (energySource == null) System.out.println("Energy source is not set.");
        return energySource;
    }

    public void setEnergySource(String energySource) {
        if (energySource.equals("gas") || energySource.equals("electricity") || energySource.equals("diesel")) {
            this.energySource = energySource;
        } else {
            System.out.println("invalid energy source: " + energySource);
        }
    }
}
