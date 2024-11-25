package homework11OOPAbstraction.transports;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new DieselMotorCar(),
                new HybridElectroCar(),
                new MotorCycle()
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle type: " + vehicle.getVehicleType());
            System.out.println("Energy source: " + vehicle.getEnergySource());
            vehicle.start();
        }
    }
}
