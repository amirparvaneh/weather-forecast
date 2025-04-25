package com.weatherforecast.exception;

public class ExternalCallException extends RuntimeException{

    public ExternalCallException(String message){
        super(message);
    }
}
