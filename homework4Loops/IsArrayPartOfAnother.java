package homework4Loops;

public class IsArrayPartOfAnother {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 8, 0, -2, 4};
        int[] arr2 = {8, 0, -2};

        if (!(arr2.length < arr1.length && arr2.length > 1)) {
            System.out.println("'arr1' length is greater arr2 or is less 1.");
        }

        boolean isArrayContainsAnother = false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[0]) {
                isArrayContainsAnother = true;

                for (int j = 0; j < arr2.length; j++) {
                    if (arr1.length - (i+1 + arr2.length) < 0) break;

                    if (!(arr2[j] == arr1[i + j])) {
                        isArrayContainsAnother = false;
                        break;
                    }
                }
            }

            if (isArrayContainsAnother) break;
        }

        System.out.println(isArrayContainsAnother?
                "'arr1' contains in 'arr2'.":
                "'arr1' doesn't contain in 'arr2'."
        );
    }
}
