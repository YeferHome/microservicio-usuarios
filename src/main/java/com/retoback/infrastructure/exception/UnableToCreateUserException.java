package com.retoback.infrastructure.exception;

public class UnableToCreateUserException extends RuntimeException {
    public UnableToCreateUserException(String message) {
        super(message);
    }
}
