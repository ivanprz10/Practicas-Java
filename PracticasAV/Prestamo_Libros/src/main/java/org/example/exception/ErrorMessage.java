package org.example.exception;

import java.util.Objects;

public enum ErrorMessage {
    STUDENT_NOT_FOUND("ESTUDIANTE CON EL DNI %s NO ES ENCONTRADO"),
    DUPLICATE_STUDENT("ESTUDIANTE CON EL DNI %s Y CON EL NOMBRE %s YA EXISTE"),
    BOOK_NOT_FOUND("LIBRO CON EL ISBN %s NO ENCONTRADO"),
    DUPLICATE_BOOK("LIBRO CON DNI  '%s'  Y NOMBRE  '%s'  YA EXISTE"),
    DUPLICATE_LOAN("YA EXISTE EL PRESTAMO PARA EL LIBRO ID: %s Y ESTUDIANTE ID: %s"),
    LOAN_NOT_FOUND("PRESTAMO NO ENCONTRADO CON ID: %s");

    private final String messageFormat;

    ErrorMessage(String messageFormat){

        this.messageFormat = messageFormat;

    }

    public String formatMessage(Object... args){
        return String.format(messageFormat, args);
    }

}
