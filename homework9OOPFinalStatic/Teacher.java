package homework9OOPFinalStatic;

public class Teacher {
    private static int kCoefficient;
    private static int minSalary;

    private final int minBaseSalary = getMinBaseSalary();
    private int wCoefficient;

    public static int getK() {
        return kCoefficient;
    }

    public static void setK(int k) {
        if (k >= 1) {
            Teacher.kCoefficient = k;
        } else {
            System.out.println("K coefficient should be higher or equal to 1");
        }
    }

    public static int getMinSalary() {
        return minSalary;
    }

    public static void setMinSalary(int minSalary) {
        if (minSalary > 0) {
            Teacher.minSalary = minSalary;
        } else {
            System.out.println("minSalary should be higher than 0");
        }
    }

    private static int getMinBaseSalary() {
        return kCoefficient * minSalary;
    }

    public Teacher(int wCoefficient) {
        setWCoefficient(wCoefficient);
    }

    public int getWCoefficient() {
        return wCoefficient;
    }

    public void setWCoefficient(int wCoefficient) {
        this.wCoefficient = wCoefficient;
    }

    public int getSalary() {
        return wCoefficient * minBaseSalary;
    }
}
