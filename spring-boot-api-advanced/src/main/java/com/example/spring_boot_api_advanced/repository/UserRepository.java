package com.example.spring_boot_api_advanced.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_boot_api_advanced.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos adicionais podem ser definidos aqui
}