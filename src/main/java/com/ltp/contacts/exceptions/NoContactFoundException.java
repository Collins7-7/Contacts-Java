package com.ltp.contacts.exceptions;

public class NoContactFoundException extends RuntimeException {

    public NoContactFoundException(String id) {
        super("The id '" + id + "' does not exist in our records");
    }

}
