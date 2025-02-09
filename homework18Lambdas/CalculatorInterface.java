package homework18Lambdas;

@FunctionalInterface
public interface CalculatorInterface {
    int calculate(int a, int b) throws CalculatorInterfaceException;
}
