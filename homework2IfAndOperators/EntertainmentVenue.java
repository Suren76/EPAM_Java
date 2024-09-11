package homework2IfAndOperators;

import java.util.Scanner;

public class EntertainmentVenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the amount of money you have: ");
        int balance = scanner.nextInt();
        System.out.print("Please enter your age: ");
        int ageOfCustomer = scanner.nextInt();
        System.out.print("Do you a vip customer (true/false): ");
        boolean vipStatus = scanner.nextBoolean();

        if ( !(ageOfCustomer >= 16 && (vipStatus || balance > 5000)) ) {
            System.exit(100);
        }

        System.out.print("Please enter your order price: ");
        int orderPrice = scanner.nextInt();
        float orderPriceWithDiscountIfHave = vipStatus? ((orderPrice / 100.0f) * 85): orderPrice;

        System.out.println("Money spent: " + (orderPriceWithDiscountIfHave + (vipStatus? 0: 5000) ));
    }
}
