package com.example.spring_boot_api_advanced.service; // Correto

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean authenticate(String username, String password) {
        // Simula validação (fictícia)
        return "admin".equals(username) && "123".equals(password);
    }
}
