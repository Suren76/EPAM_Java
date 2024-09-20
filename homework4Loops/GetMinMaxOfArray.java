package homework4Loops;

public class GetMinMaxOfArray {
    public static void main(String[] args) {
        int[] array = {56, 23, 78, 32, 9, 0, -9, -748, 891};

        int min = array[0], max = array[0];

        for (int currentNumber : array) {
            max = currentNumber > max? currentNumber: max;
            min = currentNumber < min? currentNumber: min;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
