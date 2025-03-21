package com.example.spring_boot_api_advanced;

import com.example.spring_boot_api_advanced.controller.UserController;
import com.example.spring_boot_api_advanced.model.User; // Certifique-se de que a classe User está importada
import com.example.spring_boot_api_advanced.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean // Usando MockBean para simular o UserService
    private UserService userService;

    @Test
    public void testGetUsers() throws Exception {
        // Simula o retorno de uma lista de usuários
        Mockito.when(userService.getAllUsers()).thenReturn(List.of(new User("user1"), new User("user2")));

        mockMvc.perform(get("/api/users") // Substitua pela rota correta
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("user1")) // Verifica o primeiro usuário
                .andExpect(jsonPath("$[1].name").value("user2")); // Verifica o segundo usuário
    }
}