package homework4Loops;

public class GetLongestIncreasingSequence {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 7, 8, 9};

        int lengthOfLongestIncreasingSequence = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                int lengthOfIncreasingSequence = 0;
                while (i < array.length - 1 && array[i + 1] > array[i] ) {
                    lengthOfIncreasingSequence++;
                    i++;
                }

                if (lengthOfIncreasingSequence > lengthOfLongestIncreasingSequence) {
                    lengthOfLongestIncreasingSequence = lengthOfIncreasingSequence;
                }
            }
        }

        System.out.println("Length of the longest sequence: " + lengthOfLongestIncreasingSequence);
    }
}
