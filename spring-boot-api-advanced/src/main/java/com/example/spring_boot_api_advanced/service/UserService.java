package com.example.spring_boot_api_advanced.service;

import com.example.spring_boot_api_advanced.model.User;
import com.example.spring_boot_api_advanced.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll(); // agora acessa o banco de dados real
    }
}
