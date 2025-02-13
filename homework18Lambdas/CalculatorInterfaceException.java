package homework18Lambdas;

public class CalculatorInterfaceException extends Exception {
    public CalculatorInterfaceException(String message) {
        super(message);
    }

    public CalculatorInterfaceException() {}

    public Object throwException() throws CalculatorInterfaceException {
        throw this;
    }
}
