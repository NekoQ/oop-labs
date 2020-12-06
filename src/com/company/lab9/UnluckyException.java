package com.company.lab9;

public class UnluckyException extends Exception {
    public UnluckyException() { super(); }
    public UnluckyException(String mess) { super(mess); }
    public UnluckyException(String message, Throwable cause) { super(message, cause); }
    public UnluckyException(Throwable cause) { super(cause); }
}
