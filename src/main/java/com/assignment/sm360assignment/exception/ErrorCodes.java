package com.assignment.sm360assignment.exception;

public enum ErrorCodes {

    DEALER_NOT_FOUND(1000),
    DEALER_NOT_VALID(1001),
    DEALER_ALREADY_IN_USE(1002),
    DEALER_NAME_IS_EXIST(1003),

    LISTING_NOT_FOUND(2000),
    LISTING_NOT_VALID(2001),
    LISTING_NON_MODIFIABLE(2002),
    LISTING_ALREADY_IN_USE(2003);
    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
