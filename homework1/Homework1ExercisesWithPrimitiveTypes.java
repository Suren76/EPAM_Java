package homework1;

import java.util.Scanner;

public class Homework1ExercisesWithPrimitiveTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("exercise 1");

        System.out.print("Please type your number: ");
        int numberFromUser = scanner.nextInt();

        System.out.println("Ones: " + (int) (numberFromUser / 1000) );
        System.out.println("Tens: " + (int) (numberFromUser % 1000 / 100 ) );
        System.out.println("Hundreds: " + (int) (numberFromUser % 100 / 10 ) );
        System.out.println("Thousands: " + (int) (numberFromUser % 10 ) );
        System.out.println();


        System.out.println("exercise 2");
        double firstDoubleNumber = 4.42;
        double secondDoubleNumber = 5.125;
        double thirdDoubleNumber = 1.8545;

        System.out.println("Numbers: ["+firstDoubleNumber+", "+secondDoubleNumber+", "+thirdDoubleNumber+"]");
        System.out.println( "The integer part of the sum: " + (int) (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) );
        System.out.println( "The fractional part of the sum: " + (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) % 1 );
        System.out.println( "Sum of integer parts of numbers: " + ((int) firstDoubleNumber + (int) secondDoubleNumber + (int) thirdDoubleNumber) );
        System.out.println();


        System.out.println("exercise 3");
        System.out.print("Please type number a: ");
        int a = scanner.nextInt();
        System.out.print("Please type number b: ");
        int b = scanner.nextInt();

        System.out.println("Is a divisible by b without remainder: " + ( a % b == 0));
        System.out.println();


        System.out.println("exercise 4");
        System.out.print("Please type lower case letter: ");
        char charFromUser = scanner.next().charAt(0);
        System.out.println("Letter in upper case: " + (char) ((int) charFromUser - 32) );
    }
}
