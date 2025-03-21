package com.example.spring_boot_api_advanced;

import com.example.spring_boot_api_advanced.controller.UserController;
import com.example.spring_boot_api_advanced.model.User;
import com.example.spring_boot_api_advanced.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean; // Corrigido para o pacote correto do MockBean
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.mockito.Mockito; // Corrigido o import para o Mockito

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

    // O MockMvc já é configurado automaticamente pelo Spring com @AutoConfigureMockMvc, então @Autowired não é necessário
    private final MockMvc mockMvc;

    // Usando @MockBean para injetar um mock do UserService
    @MockBean
    private UserService userService;

    // Injetando o UserController de maneira automática
    @InjectMocks
    private UserController userController;

    // Construtor para configurar MockMvc manualmente
    public UserControllerTests(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void testGetUsers() throws Exception {
        // Mockando a resposta do serviço
        Mockito.when(userService.getAllUsers()).thenReturn(List.of(new User("user1"), new User("user2")));

        // Performando a requisição GET e verificando os resultados
        mockMvc.perform(get("/api/users")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("user1"))
                .andExpect(jsonPath("$[1].name").value("user2"));
    }
}
