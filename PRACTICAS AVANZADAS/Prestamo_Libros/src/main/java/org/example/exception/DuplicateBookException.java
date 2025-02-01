package org.example.exception;

public class DuplicateBookException extends RuntimeException{
    public DuplicateBookException(String message){
        super(message);
    }
}
