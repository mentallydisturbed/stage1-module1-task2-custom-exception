package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
