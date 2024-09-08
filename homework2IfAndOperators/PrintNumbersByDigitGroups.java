package homework2IfAndOperators;

import java.util.Scanner;

public class PrintNumbersByDigitGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type your number: ");
        int numberFromUser = scanner.nextInt();

        if (!(999 < numberFromUser && numberFromUser < 10000)) {
            System.out.println("The number is out of range(1000-9999). number("+numberFromUser+")");
            System.exit(100);
        }

        System.out.println("Ones: " + (int) (numberFromUser / 1000) );
        System.out.println("Tens: " + (int) (numberFromUser % 1000 / 100 ) );
        System.out.println("Hundreds: " + (int) (numberFromUser % 100 / 10 ) );
        System.out.println("Thousands: " + (int) (numberFromUser % 10 ) );
    }
}
