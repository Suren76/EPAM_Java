package homework3SwitchCaseAndArrays;

import java.util.Scanner;

public class SetMiddleElementsOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input array length: ");
        int n = scanner.nextInt();

        if (!(n >= 2 && n <= 8)) {
            System.out.println("Array's length is out of range(2-8)");
            System.exit(120);
        }

        int[] arrayOfNumbers = new int[n];

        System.out.print("Please input number a: ");
        int a = scanner.nextInt();
        System.out.print("Please input number b: ");
        int b = scanner.nextInt();

        int min = a > b? b: a;
        int max = a > b? a: b;

        arrayOfNumbers[arrayOfNumbers.length/2 - 1] = min;
        arrayOfNumbers[arrayOfNumbers.length/2 + (arrayOfNumbers.length%2 == 0? 0: 1)] = max;
    }
}
