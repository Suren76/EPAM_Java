package homework6MethodOverloading;

public class CalculateIncomeTaxBasedOnSalary {
    public static void main(String[] args) {
        int grossSalary = 500;
        int customTaxRate = 15;
        boolean isEmployeeITWorker = true;

        System.out.println("The gross salary: " + grossSalary);

        System.out.println("Tax of gross salary with default tax rate(20%): " + calculateIncomeTax(grossSalary));
        System.out.println("Tax of gross salary with custom tax rate(" + customTaxRate + "%): " + calculateIncomeTax(grossSalary, customTaxRate));
        System.out.println("Tax of gross salary with default(20%) or special(10%) tax rate: " + calculateIncomeTax(grossSalary, isEmployeeITWorker));
    }

    static double calculateIncomeTax(int grossSalary, int taxRateInPercent) {
        double taxRate = (taxRateInPercent / 100.0);
        return grossSalary * taxRate;
    }

    static double calculateIncomeTax(int grossSalary) {
        // set the default tax rate 20%
        return calculateIncomeTax(grossSalary, 20);
    }

    static double calculateIncomeTax(int grossSalary, boolean isITSectorEmployee) {
        // set the special tax rate 10% if employee is IT worker
        return isITSectorEmployee?
                calculateIncomeTax(grossSalary, 10):
                calculateIncomeTax(grossSalary);
    }
}
