package homework4Loops;

import java.util.Scanner;

public class GetSliceOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input array length: ");
        int n = scanner.nextInt();

        int[] arrayOfNumbers = new int[n];

        System.out.print("Please input number a: ");
        int a = scanner.nextInt();
        System.out.print("Please input number b: ");
        int b = scanner.nextInt();

        int[] sliceOfArray = new int[b - a + 1];

        for (int indexToGet = a; indexToGet <= b; indexToGet++) {
            sliceOfArray[indexToGet - a] = arrayOfNumbers[indexToGet];
        }
    }
}
