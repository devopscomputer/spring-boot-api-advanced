package com.example.spring_boot_api_advanced.repository;

import com.example.spring_boot_api_advanced.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
