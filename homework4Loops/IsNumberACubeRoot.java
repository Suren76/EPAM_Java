package homework4Loops;

import java.util.Scanner;

public class IsNumberACubeRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int numberToCheck = scanner.nextInt();

        if (numberToCheck == 1) {
            System.out.println("The cube of 1 is 1");
            System.exit(0);
        }

        boolean isNumberPositive = numberToCheck > 0;
        numberToCheck = isNumberPositive? numberToCheck: numberToCheck * -1;
        for (int i = 2; i < numberToCheck/3; i++) {
            if (numberToCheck % (i * i * i) == 0) {
                System.out.println("The number is cube of " + (isNumberPositive? "": "-") + i);
                System.exit(0);
            }
        }

        System.out.println("The number isn't cube of any number.");

    }
}
