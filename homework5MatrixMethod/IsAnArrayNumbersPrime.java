package homework5MatrixMethod;

public class IsAnArrayNumbersPrime {
    public static void main(String[] args) {
        int[] array = {5, 49, 165, 3, 81, 9, 86, 22, 6};

        for (int numberToCheck: array) {
            System.out.println(
                    isNumberPrime(numberToCheck)?
                            "Array number " + numberToCheck + "is prime":
                            "Array number " + numberToCheck + "is not prime"
            );
        }
    }

    static boolean isNumberPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
