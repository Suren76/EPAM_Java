package homework12Exceptions.exceptions;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super("Insufficient balance on the card. Transaction cancelled."
                + (message == null? "": "extra message " + message));
    }

  public InsufficientBalanceException() {
      this(null);
  }
}
