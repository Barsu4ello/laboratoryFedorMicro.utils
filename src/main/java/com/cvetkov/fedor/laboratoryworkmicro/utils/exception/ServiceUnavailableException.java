package com.cvetkov.fedor.laboratoryworkmicro.utils.exception;

public class ServiceUnavailableException extends RuntimeException{
    public ServiceUnavailableException(String message) {
        super(message);
    }

    public ServiceUnavailableException(String message, Throwable e) {
        super(message, e);
    }
}
