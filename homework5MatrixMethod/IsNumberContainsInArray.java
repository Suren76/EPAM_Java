package homework5MatrixMethod;

public class IsNumberContainsInArray {
    public static void main(String[] args) {
        int[] arrayToCheck = {4, 7, 9, -2, 1, -1};
        int numberToCheckInArray = 4;

        System.out.println(
                isNumberContainsInArray(arrayToCheck, numberToCheckInArray)?
                        "Number contains in array.":
                        "Number don't contain in array."
        );
    }

    static boolean isNumberContainsInArray(int[] array, int numberToCheck) {
        for (int number: array) if (number == numberToCheck) return true;
        return false;
    }
}
