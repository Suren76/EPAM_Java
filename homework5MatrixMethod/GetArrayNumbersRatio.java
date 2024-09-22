package homework5MatrixMethod;

public class GetArrayNumbersRatio {
    public static void main(String[] args) {
        int[] arrayToTest = {4, -7, 9, -2, 1, 1};

        System.out.println("Array elements ratio(positive / negative): " + getArrayNumbersRatio(arrayToTest));
    }

    static double getArrayNumbersRatio(int[] array) {
        int positiveNumbersCount = 0, negativeNumbersCount = 0;

        for (int number: array) {
            if (number > 0) positiveNumbersCount++;
            if (number < 0) negativeNumbersCount++;
        }

        if (negativeNumbersCount ==0) return -1;
        return 1.0 * positiveNumbersCount / negativeNumbersCount;
    }
}
