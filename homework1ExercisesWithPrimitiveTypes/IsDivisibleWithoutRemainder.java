package homework1ExercisesWithPrimitiveTypes;

import java.util.Scanner;

public class IsDivisibleWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type number a: ");
        int a = scanner.nextInt();
        System.out.print("Please type number b: ");
        int b = scanner.nextInt();

        System.out.println("Is a divisible by b without remainder: " + ( a % b == 0));
    }
}
