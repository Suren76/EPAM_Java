package homework1ExercisesWithPrimitiveTypes;

import java.util.Scanner;

public class OperationsWithDoubleNumbers {
    public static void main(String[] args) {
        double firstDoubleNumber = 4.42;
        double secondDoubleNumber = 5.125;
        double thirdDoubleNumber = 1.8545;

        System.out.println("Numbers: ["+firstDoubleNumber+", "+secondDoubleNumber+", "+thirdDoubleNumber+"]");
        System.out.println( "The integer part of the sum: " + (int) (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) );
        System.out.println( "The fractional part of the sum: " + (firstDoubleNumber + secondDoubleNumber + thirdDoubleNumber) % 1 );
        System.out.println( "Sum of integer parts of numbers: " + ((int) firstDoubleNumber + (int) secondDoubleNumber + (int) thirdDoubleNumber) );
    }
}
