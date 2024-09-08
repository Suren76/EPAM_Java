package homework2IfAndOperators;

import java.util.Scanner;

public class IsTriangleEdgesValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type edge a: ");
        int a = scanner.nextInt();
        System.out.print("Please type edge b: ");
        int b = scanner.nextInt();
        System.out.print("Please type edge c: ");
        int c = scanner.nextInt();

        if (a+b > c && a+c > b && b+c > a) {
            System.out.println("Triangle can be build.");
        }
        else {
            System.out.println("Triangle can't be build.");
        }

        System.out.println("Triangle edges(a: "+a + ", b: "+b + ", c: "+c + ")");
    }
}
