package com.example.common.exception;

public class CustomAuthenticationEntryPointException extends RuntimeException {
    public CustomAuthenticationEntryPointException(String message, Throwable t) {
        super(message, t);
    }

    public CustomAuthenticationEntryPointException(String message) {
        super(message);
    }

    public CustomAuthenticationEntryPointException() {
        super();
    }
}