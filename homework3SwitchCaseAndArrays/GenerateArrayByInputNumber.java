package homework3SwitchCaseAndArrays;

import java.util.Scanner;

public class GenerateArrayByInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input length of array: ");
        int arrayLength = scanner.nextInt();
        int[] generatedArray;

        switch (arrayLength) {
            case 3:
                generatedArray = new int[3];
                break;
            case 4:
                generatedArray = new int[4];
                break;
            case 5:
                generatedArray = new int[5];
                break;
            case 6:
            case 7:
                generatedArray = new int[10];
                break;
            default:
                generatedArray = new int[15];
                generatedArray[0] = 15;
        }
    }
}
