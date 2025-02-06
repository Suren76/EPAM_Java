package homework17DataStructuresTreeMap;

import java.util.*;

public class CountNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(
                5, 5,
                6, 6, 6, 6,
                9, 9, 9, 9,
                12, 12
        ));

        System.out.println(integerArrayList);

        Map<Integer, Integer> countedNumbers = calculateListItemsCount(integerArrayList);

        System.out.println("items count: " + countedNumbers);
    }

    public static Map<Integer, Integer> calculateListItemsCount(List<Integer> integerArrayList) {
        // it could be also implemented by 'Collections.frequency()' to get number count in list
        // but current solution will work faster

        HashMap<Integer, Integer> countedNumbersMap = new HashMap<>();

        for (Integer numberToCount : integerArrayList) {
            countedNumbersMap.put(
                    numberToCount,
                    // get the current calculated count of number
                    countedNumbersMap.getOrDefault(numberToCount, 0) + 1
            );
        }

        return countedNumbersMap;
    }
}
