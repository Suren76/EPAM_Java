package homework11OOPAbstraction.HeatingSystem;

public class Main {
    public static void main(String[] args) {
        HeatingSystem[] heatingSystems = {
                new HomeHeatingSystem(new ElectricBoiler(), 200),
                new ApartmentHeatingSystem(new GasBoiler(), 100)
        };

        for (HeatingSystem heatingSystem : heatingSystems) {
            heatingSystem.setMonthToCalculate(new DaysCounter("july", 30));

            System.out.println("boiler type: " + heatingSystem.getBoilerType());

            System.out.println("calculate monthly gas consumption: " + heatingSystem.calculateMonthlyGasConsumption());
            System.out.println("calculate monthly electricity consumption: " + heatingSystem.calculateMonthlyElectricityConsumption());
        }
    }
}
