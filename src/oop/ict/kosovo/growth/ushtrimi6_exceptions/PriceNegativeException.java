package oop.ict.kosovo.growth.ushtrimi6_exceptions;

public class PriceNegativeException extends Exception {
    public PriceNegativeException() {
        super();
    }

    public PriceNegativeException(String message) {
        super(message);
    }

    public PriceNegativeException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
