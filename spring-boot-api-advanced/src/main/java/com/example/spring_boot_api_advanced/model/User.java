package com.example.spring_boot_api_advanced.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Necessário para que a classe seja reconhecida como uma entidade JPA
public class User {

    @Id // Anotação para a chave primária
    private Long id;  // Adicionando um campo ID para ser a chave primária
    
    private String name;

    // Construtor necessário para frameworks como JPA e Jackson
    public User() {}

    public User(String name) {
        this.name = name;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
