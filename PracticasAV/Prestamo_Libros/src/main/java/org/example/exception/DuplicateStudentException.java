package org.example.exception;

public class DuplicateStudentException extends RuntimeException{
    public DuplicateStudentException(String message){
        super(message);
    }
}
