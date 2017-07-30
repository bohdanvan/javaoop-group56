package com.bvan.oop.lessons9_10.io;

/**
 * @author bvanchuhov
 */
public class IllegalFormatException extends RuntimeException {

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
