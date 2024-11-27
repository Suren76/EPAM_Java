package homework11OOPAbstraction.HeatingSystem;

public abstract class Boiler {
    protected String brand;
    private String type;
    protected double waterCapacity;
    protected double energySavingPercentage;
    private double waterPressureControl;

    public abstract int priceForGasPerWaterLiter();
    public abstract int priceForElectricityPerWaterLiter();

    protected Boiler(String brand, String type, double waterCapacity, double energySavingPercentage, double waterPressureControl) {
        this.brand = brand;
        this.waterCapacity = waterCapacity;
        this.energySavingPercentage = energySavingPercentage;
        setType(type);
        setWaterPressureControl(waterPressureControl);
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        if (type.equals("gas") || type.equals("electro") || type.equals("wood")) {
            this.type = type;
        } else {
            System.out.println("out of accepted values: " + type);
        }
    }

    public double getWaterPressureControl() {
        return waterPressureControl;
    }

    private void setWaterPressureControl(double waterPressureControl) {
        if (0 <= waterPressureControl && waterPressureControl <= 100) {
            this.waterPressureControl = waterPressureControl;
            sendRequestToChangeWaterPressure(waterPressureControl);
        } else {
            System.out.println("Water pressure you entered is out of accepted range(0.0-100.0): " + waterPressureControl);
        }
    }

    private void sendRequestToChangeWaterPressure(double pressureToSet) {
        System.out.println("Request to change water pressure to " + pressureToSet);
    }

    public void changeWaterPressureTo(double waterPressure) {
        setWaterPressureControl(waterPressure);
    }
}



