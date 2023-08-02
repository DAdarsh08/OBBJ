package com.SBI;

public class InvalidAccnoException extends Exception{
    public InvalidAccnoException() {
        super("Invalid Stiring");
    }

    public InvalidAccnoException(String accno) {
        super("Invalid account number "+ accno);
    }

  }

