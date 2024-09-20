package homework4Loops;

public class InsertNegativeElementIndexIntoArray {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, -2, 1, -1};

        int lengthOfNewArray = array.length;
        for (int number: array) lengthOfNewArray = number < 0? lengthOfNewArray + 1: lengthOfNewArray;

        int[] newArray = new int[lengthOfNewArray];

        for (int i = 0, indexToAdd = 0; i < array.length; i++) {
            newArray[indexToAdd++] = array[i];
            if (array[i] < 0) {
                newArray[indexToAdd++] = i;
            }
        }
    }
}
