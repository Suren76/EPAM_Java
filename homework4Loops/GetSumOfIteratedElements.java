package homework4Loops;

public class GetSumOfIteratedElements {
    public static void main(String[] args) {
        double[] array = {4.001, 3435.0, 45.145, 46535.0, -44.44, -1320000.35, 0, 505050505};

        double sumOfIteratedElements = 0;

        for (int i = 0; i < array.length;) {
            if (array[i] == 0) break;

            sumOfIteratedElements += array[i];

            if (array[i] > 0) i++;
            else if (array[i] < 0) i+=2;
        }

        System.out.println("Sum of iterated elements: " + sumOfIteratedElements);
    }
}
