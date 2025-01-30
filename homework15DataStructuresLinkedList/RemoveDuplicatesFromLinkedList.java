package homework15DataStructuresLinkedList;

import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
    public static <T> LinkedList<T> removeDuplicatesFromLinkedList(LinkedList<T> listToRemoveDuplicates) {
        LinkedList<T> listRemovedDuplicates = new LinkedList<>();

        for (T itemToCheck : listToRemoveDuplicates) {
            if (!isElementContainsOnList(listRemovedDuplicates, itemToCheck)) {
                listRemovedDuplicates.add(itemToCheck);
            }
        }

        return listRemovedDuplicates;
    }

    public static <T> boolean isElementContainsOnList(LinkedList<T> linkedList, T elementToCheck) {
        for (T listElement : linkedList) {
            if (elementToCheck.equals(listElement)) {
                return true;
            }
        }
        return false;
    }
}

