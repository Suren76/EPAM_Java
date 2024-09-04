package homework1ExercisesWithPrimitiveTypes;

import java.util.Scanner;

public class PrintNumbersByDigitGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type your number: ");
        int numberFromUser = scanner.nextInt();

        System.out.println("Ones: " + (int) (numberFromUser / 1000) );
        System.out.println("Tens: " + (int) (numberFromUser % 1000 / 100 ) );
        System.out.println("Hundreds: " + (int) (numberFromUser % 100 / 10 ) );
        System.out.println("Thousands: " + (int) (numberFromUser % 10 ) );
    }
}
