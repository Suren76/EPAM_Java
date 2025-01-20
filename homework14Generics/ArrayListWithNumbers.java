package homework14Generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithNumbers {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(1.5);

        numberList.add(11);
        numberList.add(11.2);

        numberList.add(8);
        numberList.add(8.39);

        numberList.add(108.0);

        System.out.println(numberList);

        ArrayList<Integer> filteredList = getIntegerList(numberList);
        System.out.println(filteredList);
    }

    public static ArrayList<Integer> getIntegerList(ArrayList<Number> numberArrayList) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (Number number : numberArrayList) {
            if (checkIsNumberInteger(number)) {
                integerArrayList.add((Integer) number);
            }
        }

        return integerArrayList;
    }

    private static boolean checkIsNumberInteger(Number number) {
        return number.getClass() == Integer.class;
    }
}
