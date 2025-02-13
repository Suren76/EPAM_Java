package homework18Lambdas;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface calculateSum = Integer::sum;
        CalculatorInterface calculateSubtract = CalculatorUtils::numberSubtraction;
        CalculatorInterface calculateDivision = (a, b) ->
                b == 0 ? (int) new ZeroDivisionException().throwException() : a / b;
        CalculatorInterface calculateMultiply = (a, b) -> a * b;

        checkCalculatorObject(calculateSum, 5, 5, 10, "sum");
        checkCalculatorObject(calculateSubtract, 5, 5, 0, "subtract");
        checkCalculatorObject(calculateDivision, 5, 5, 1, "division");
        checkCalculatorObject(calculateMultiply, 5, 5, 25, "multiply");
    }

    static void checkCalculatorObject(CalculatorInterface calculatorObject, int a, int b, int expectedResult, String operation) {
        System.out.println(
                "check %s: (%s, %s), %s".formatted(
                        operation,
                        a, b,
                        expectedResult
                )
        );
        try {
            System.out.println(
                    "result: " + (calculatorObject.calculate(a, b) == expectedResult)
            );
        } catch (CalculatorInterfaceException e) {
            System.out.println(
                    "%s: (a, b)=(%s, %s), expectedResult: %s".formatted(
                            e.getClass().getSimpleName(),
                            a, b,
                            expectedResult
                    )
            );
        }
    }
}
