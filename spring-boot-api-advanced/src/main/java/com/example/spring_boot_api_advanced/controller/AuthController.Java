package com.example.spring_boot_api_advanced.controller; // Correto

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/auth/login")
    public String login() {
        return "Autenticação realizada com sucesso!";
    }
}