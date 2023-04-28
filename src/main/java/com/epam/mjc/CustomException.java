package com.epam.mjc;

public class CustomException extends IllegalArgumentException {
    public CustomException(Long id) {
        super("Could not find student with ID " + id);
    }
}
