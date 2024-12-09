package homework13Recursions;

import homework13Recursions.exceptions.NumberIsLowerThanZeroException;

public class NumberToBinary {
    public static void main(String[] args) {
        System.out.println(new NumberToBinary().numberToBinary(-7));
    }

    private void checkIsNumberValid(int number) throws NumberIsLowerThanZeroException {
        if (number < 0) {
            throw new NumberIsLowerThanZeroException("number: " + number);
        }
    }

    private String castNumberToBinaryString(int number) {
        if (number == 0) return "";
        return (number%2 == 0? "0": "1") + castNumberToBinaryString(number / 2);
    }

    public String numberToBinary(int number) {
        String signOfNumber = "";

        try {
            checkIsNumberValid(number);
        } catch (NumberIsLowerThanZeroException e) {
            signOfNumber = "-";
        }

        return signOfNumber + castNumberToBinaryString(number);
    }
}

