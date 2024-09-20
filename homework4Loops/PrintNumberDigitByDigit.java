package homework4Loops;

public class PrintNumberDigitByDigit {
    public static void main(String[] args) {
        double numberToPrint = 789654123;

        int lengthOfNumber = 0;

        while (true) {
            lengthOfNumber++;
            numberToPrint /= 10;

            if (numberToPrint < 1) break;
        }

        for (int i = 0; i < lengthOfNumber; i++) {
            System.out.println((int) ((numberToPrint *= 10) % 10 ));
        }
    }
}
