package homework1ExercisesWithPrimitiveTypes;

import java.util.Scanner;

public class LowerCaseCharToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type lower case letter: ");
        char charFromUser = scanner.next().charAt(0);
        System.out.println("Letter in upper case: " + (char) ((int) charFromUser - 32) );
    }
}
