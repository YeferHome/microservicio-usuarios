package com.retoback.infrastructure.exception;

public class OnlyAnOwnerCanCreateEmployeeException extends RuntimeException {
    public OnlyAnOwnerCanCreateEmployeeException (String message) {super(message);}
}
