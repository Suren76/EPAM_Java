package homework10OOPInheritance.buildingsTask;

public class Building {
    private DrainageSystem drainageSystem;
    private ElectricitySystem electricitySystem;

    private Building(DrainageSystem drainageSystem, ElectricitySystem electricitySystem) {
        setDrainageSystem(drainageSystem);
        setElectricitySystem(electricitySystem);
    }

    public Building(int drainageSystemOutsCount, int electricitySystemVoltage) {
        this(new DrainageSystem(drainageSystemOutsCount), new ElectricitySystem(electricitySystemVoltage));
    }

    public int getDrainageSystemOutsCount() {
        return drainageSystem.getDrainageSystemOuts();
    }

    private void setDrainageSystem(DrainageSystem drainageSystem) {
        this.drainageSystem = drainageSystem;
    }

    public int getElectricitySystemVoltage() {
        return electricitySystem.getVoltage();
    }

    private void setElectricitySystem(ElectricitySystem electricitySystem) {
        this.electricitySystem = electricitySystem;
    }
}
