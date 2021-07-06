package com.example.common.exception;

public class CustomUserExistsException extends RuntimeException {
    public CustomUserExistsException(String message, Throwable t) {
        super(message, t);
    }

    public CustomUserExistsException(String message) {
        super(message);
    }

    public CustomUserExistsException() {
        super();
    }
}
