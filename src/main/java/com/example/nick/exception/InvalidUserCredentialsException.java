package com.example.nick.exception;

public class InvalidUserCredentialsException extends RuntimeException{
    public InvalidUserCredentialsException() {
        super("Invalid User Credentials Exeption");
    }
}
