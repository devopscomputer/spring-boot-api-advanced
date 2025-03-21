package com.example.spring_boot_api_advanced.repository;

import com.example.spring_boot_api_advanced.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional; // ✅ ESTE IMPORTA Optional

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
