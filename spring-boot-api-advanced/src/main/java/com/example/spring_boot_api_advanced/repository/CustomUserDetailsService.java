package com.example.spring_boot_api_advanced.repository;

import com.example.spring_boot_api_advanced.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // aqui você pode usar email, login ou username dependendo da sua entidade
        Optional<com.example.spring_boot_api_advanced.model.User> optionalUser = userRepository.findByName(username);

        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("Usuário não encontrado com nome: " + username);
        }

        com.example.spring_boot_api_advanced.model.User user = optionalUser.get();

      
