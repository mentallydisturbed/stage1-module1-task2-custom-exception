package com.epam.mjc;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
