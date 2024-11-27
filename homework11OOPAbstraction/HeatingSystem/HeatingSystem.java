package homework11OOPAbstraction.HeatingSystem;

abstract class HeatingSystem {
    protected Boiler boiler;
    protected String houseType;
    protected double area;
    protected DaysCounter monthUsesHeater;

    protected abstract int getHeaterElementCount();
    protected abstract double getDailyUsedWaterAmountPerHeater();

    protected HeatingSystem(Boiler boiler, String houseType, double area) {
        this.boiler = boiler;
        this.houseType = houseType;
        this.area = area;
    }

    public String getBoilerType() {
        return boiler.getType();
    }

    private void setHouseType(String houseType) {
        if (houseType.equals("apartment") || houseType.equals("home")) {
            this.houseType = houseType;
        } else {
            System.out.println("Not implemented house type!");
        }
    }

    protected int getHeaterUsageDaysCount() {
        return monthUsesHeater.getHeaterUsageDaysCount();
    }

    protected double getDailyUsedAllWaterAmount() {
        return getDailyUsedWaterAmountPerHeater() * getHeaterElementCount();
    }

    protected double getDailyUsedGasAmount() {
        return boiler.priceForGasPerWaterLiter() * getDailyUsedAllWaterAmount();
    }

    protected double getDailyUsedGasAmountWithSavedPercent() {
        return getDailyUsedGasAmount() * ((100 - boiler.energySavingPercentage) / 100);
    }

    public int calculateMonthlyGasConsumption() {
        return (int) (getDailyUsedGasAmountWithSavedPercent() * getHeaterUsageDaysCount());
    }

    protected double getDailyUsedElectricityAmount() {
        return boiler.priceForElectricityPerWaterLiter() * getDailyUsedAllWaterAmount();
    }

    public int calculateMonthlyElectricityConsumption() {
        return (int) (getDailyUsedElectricityAmount() * getHeaterUsageDaysCount());
    }

    public void setMonthToCalculate(DaysCounter daysCounter) {
        monthUsesHeater = daysCounter;
    }
}

