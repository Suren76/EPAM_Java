package homework2IfAndOperators;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type number: ");
        int numberFromUser = scanner.nextInt();

        if (!(numberFromUser > 99 && numberFromUser < 1000)) {
            System.out.println("Number is out of range(100*999). number("+numberFromUser+")");
            System.exit(100);
        }
        if (numberFromUser % 10 == 0) {
            System.out.println("Can't be reversed as valid number. number("+numberFromUser+")");
            System.exit(100);
        }

        int reversedNumber = ( (numberFromUser/100) + (numberFromUser%100/10 * 10) + (numberFromUser%10 * 100) );
        System.out.println("Reversed number: "+reversedNumber);
    }
}
