package homework3SwitchCaseAndArrays;

public class GetPositiveNumbersFromArray {
    public static void main(String[] args) {
        double[] arrayWithRandomDoubles = {0.56, -9.06, 8, 15.09, -7};
        double[] arrayWithPositiveNumbers = new double[5];

        if (arrayWithRandomDoubles[4] > 0) {
            arrayWithPositiveNumbers[0] = arrayWithRandomDoubles[4];
        }
        if (arrayWithRandomDoubles[3] > 0) {
            arrayWithPositiveNumbers[1] = arrayWithRandomDoubles[3];
        }
        if (arrayWithRandomDoubles[2] > 0) {
            arrayWithPositiveNumbers[2] = arrayWithRandomDoubles[2];
        }
        if (arrayWithRandomDoubles[1] > 0) {
            arrayWithPositiveNumbers[3] = arrayWithRandomDoubles[1];
        }
        if (arrayWithRandomDoubles[0] > 0) {
            arrayWithPositiveNumbers[4] = arrayWithRandomDoubles[0];
        }
    }
}
