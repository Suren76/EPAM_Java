package homework2IfAndOperators;

import java.util.Scanner;

public class LowerCaseCharToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type lower case letter: ");
        char charFromUser = scanner.next().charAt(0);

        if (!((int) charFromUser >= 97 && (int) charFromUser <= 122)) {
            System.out.println("The character you have entered is not a lowercase Latin letter. char("+charFromUser+")");
            System.exit(100);
        }
        System.out.println("Letter in upper case: " + (char) ((int) charFromUser - 32) );
    }
}
