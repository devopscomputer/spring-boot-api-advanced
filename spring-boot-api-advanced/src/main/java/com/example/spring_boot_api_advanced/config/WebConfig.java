package com.example.spring_boot_api_advanced.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    // Se precisar configurar CORS ou outras opções globais, pode adicionar aqui
}
