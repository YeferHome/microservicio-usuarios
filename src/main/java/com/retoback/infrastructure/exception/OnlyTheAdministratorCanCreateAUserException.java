package com.retoback.infrastructure.exception;

public class OnlyTheAdministratorCanCreateAUserException extends RuntimeException {
    public OnlyTheAdministratorCanCreateAUserException (String message) {super(message);}
}
