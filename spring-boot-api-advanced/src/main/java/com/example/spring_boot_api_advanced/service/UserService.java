package com.example.spring_boot_api_advanced.service;

import com.example.spring_boot_api_advanced.model.User;
import com.example.spring_boot_api_advanced.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 🔹 Criando usuário e criptografando a senha
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Criptografa senha
        return userRepository.save(user);
    }
}
