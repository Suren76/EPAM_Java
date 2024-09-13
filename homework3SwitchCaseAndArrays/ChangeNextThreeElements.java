package homework3SwitchCaseAndArrays;

import java.util.Scanner;

public class ChangeNextThreeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input array length: ");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Program can't run with array elements less than 3!");
            System.exit(120);
        }

        int[] generatedArray = new int[n];

        System.out.print("Please input a: ");
        int a = scanner.nextInt();

        if (a + 3 >= generatedArray.length) {
            System.out.print("Imputed index 'a' is out of array range! ");
            System.out.println("a=" + a + " , range(0-" + (generatedArray.length - 1) + ")");
            System.exit(120);
        }

        generatedArray[a + 1] = a + 1;
        generatedArray[a + 2] = a + 2;
        generatedArray[a + 3] = a + 3;
    }
}
