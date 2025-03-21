package com.example.spring_boot_api_advanced.controller;

import com.example.spring_boot_api_advanced.model.User;
import com.example.spring_boot_api_advanced.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // Define o prefixo para as rotas
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // 🔹 Adicionando método para criar usuário via API
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
