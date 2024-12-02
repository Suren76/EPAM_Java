package homework12Exceptions.exceptions;

public class TooMuchGiftsOnBasketException extends RuntimeException {
    public TooMuchGiftsOnBasketException(String message) {
        super("You have not removed enough gifts. Transaction cancelled."
                + (message == null? "": "extra message " + message));
    }

    public TooMuchGiftsOnBasketException() {
        this(null);
    }
}
