package homework10OOPInheritance.buildingsTask;

public class ElectricitySystem {
    private int voltage;

    public ElectricitySystem(int voltage) {
        setVoltage(voltage);
    }

    public int getVoltage() {
        return voltage;
    }

    private void setVoltage(int voltage) {
        if (voltage > 0) {
            this.voltage = voltage;
        } else {
            System.out.println("Electricity System voltage can't be less 1");
        }

    }
}
