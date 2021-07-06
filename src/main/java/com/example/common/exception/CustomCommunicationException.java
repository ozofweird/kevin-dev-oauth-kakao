package com.example.common.exception;

public class CustomCommunicationException extends RuntimeException {
    public CustomCommunicationException(String message, Throwable t) {
        super(message, t);
    }

    public CustomCommunicationException(String message) {
        super(message);
    }

    public CustomCommunicationException() {
        super();
    }
}
