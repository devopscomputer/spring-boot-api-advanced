package com.example.spring_boot_api_advanced.service;

import com.example.spring_boot_api_advanced.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    // Exemplo de armazenamento em memória
    private List<User> users = new ArrayList<>();

    public UserService() {
        // Adiciona alguns usuários de exemplo
        users.add(new User("user1"));
        users.add(new User("user2"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}