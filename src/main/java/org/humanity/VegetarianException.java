package org.humanity;

public class VegetarianException extends Exception {

    public VegetarianException(String message) {
        super(message);
    }

    public VegetarianException(String message, Throwable cause) {
        super(message, cause);
    }

    public VegetarianException(Throwable cause) {
        super(cause);
    }

    public VegetarianException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}