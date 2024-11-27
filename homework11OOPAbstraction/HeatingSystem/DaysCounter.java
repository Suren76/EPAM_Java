package homework11OOPAbstraction.HeatingSystem;

// counter to get days of heater usage
public class DaysCounter {
    private String monthName;
    private int heaterUsageDaysCount;

    public DaysCounter(String monthName, int heaterUsageDaysCount) {
        this.heaterUsageDaysCount = heaterUsageDaysCount;
        this.monthName = monthName;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getHeaterUsageDaysCount() {
        return heaterUsageDaysCount;
    }
}
