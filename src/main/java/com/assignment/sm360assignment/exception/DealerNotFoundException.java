package com.assignment.sm360assignment.exception;

public class DealerNotFoundException extends RuntimeException {
    public DealerNotFoundException(Integer dealerId) {
        super(String.format("Dealer with id %s not found", dealerId));
    }
}
