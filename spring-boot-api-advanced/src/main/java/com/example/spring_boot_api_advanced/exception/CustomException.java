package com.example.spring_boot_api_advanced.exception; // Correto

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}