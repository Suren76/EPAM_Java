package homework17DataStructuresTreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        HashMap<Integer, Integer> countedNumbersMap = new HashMap<>();

        for (Integer numberToCount : integerArrayList) {
            countedNumbersMap.put(
                    numberToCount,
                    // get the current calculated count of number
                    (
                            countedNumbersMap.get(numberToCount) == null ?
                                    0 :
                                    countedNumbersMap.get(numberToCount)
                    )+1
            );
        }

        return countedNumbersMap;
    }
}
