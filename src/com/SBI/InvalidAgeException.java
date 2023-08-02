package com.SBI;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid Age");
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(int age) {
        super("Invalid Age " + age);
    }


}
