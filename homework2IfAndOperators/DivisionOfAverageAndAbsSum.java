package homework2IfAndOperators;

import java.util.Scanner;

public class DivisionOfAverageAndAbsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type first number: ");
        short firstNumber = scanner.nextShort();
        System.out.print("Please type second number: ");
        short secondNumber = scanner.nextShort();
        System.out.print("Please type third number: ");
        short thirdNumber = scanner.nextShort();

        int averageOfNumber = (firstNumber + secondNumber + thirdNumber)/3;
        int sumOfNumbersAbs = (
                firstNumber>0 ?firstNumber : firstNumber*-1 +
                secondNumber>0 ?secondNumber : secondNumber*-1 +
                thirdNumber>0 ?thirdNumber : thirdNumber*-1
        );

        System.out.println("Result of division of average and abs sum of numbers: " + (sumOfNumbersAbs / averageOfNumber));
    }
}
