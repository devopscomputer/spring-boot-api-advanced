# Spring Boot API Advanced

## Descrição do Projeto

Este projeto é uma API REST avançada desenvolvida com o framework Spring Boot. Ele foi projetado para demonstrar boas práticas de arquitetura, segurança e desenvolvimento de APIs robustas. A API possui recursos de autenticação, gerenciamento de usuários, CRUD de produtos e é preparada para ser facilmente extensível com novas funcionalidades no futuro.

### Objetivo

- **Demonstrar Arquitetura Modular:** Apresenta uma estrutura de pacotes bem definida para facilitar a manutenção e a escalabilidade.
- **Segurança Implementada:** Integração com Spring Security para proteger endpoints e gerenciar autenticação.
- **Documentação Automatizada:** Fornece documentação em Swagger para facilitar a integração com outras aplicações.
- **Simplicidade no Desenvolvimento:** Usa boas práticas para facilitar a colaboração em equipe e acelerar o tempo de desenvolvimento.

---

## Como Rodar a Aplicação

1. **Clonar o Repositório**
   ```bash
   git clone https://github.com/devopscomputer/spring-boot-api-advanced.git
   cd spring-boot-api-advanced
Configurar o Ambiente

Certifique-se de ter o JDK 17 ou superior instalado.
Instale o Gradle (se não estiver usando o wrapper do projeto).
Instalar Dependências

bash
Copiar
./gradlew clean build --refresh-dependencies
Rodar a Aplicação

bash
Copiar
./gradlew bootRun
Acessar a Aplicação

H2 Console: http://localhost:8080/h2-console
Swagger UI: http://localhost:8080/swagger-ui.html
Endpoints da API
Usuários
GET /api/users: Lista todos os usuários.
POST /api/users: Cria um novo usuário.
GET /api/users/{id}: Busca um usuário pelo ID.
PUT /api/users/{id}: Atualiza um usuário existente.
DELETE /api/users/{id}: Remove um usuário.
Produtos
GET /api/products: Lista todos os produtos.
POST /api/products: Cria um novo produto.
GET /api/products/{id}: Busca um produto pelo ID.
PUT /api/products/{id}: Atualiza um produto existente.
DELETE /api/products/{id}: Remove um produto.
Dependências e Tecnologias Usadas
Spring Boot: Framework principal para desenvolvimento rápido de aplicações Java.
Spring Security: Para autenticação e autorização.
Spring Data JPA: Simplifica o acesso a dados e abstrai a camada de persistência.
H2 Database: Banco de dados em memória para desenvolvimento e testes rápidos.
PostgreSQL: Banco de dados relacional para ambientes de produção.
Swagger: Documentação automática e amigável para APIs.
Gradle: Ferramenta de build e gerenciamento de dependências.
Funcionalidades e Lógica Utilizada
Autenticação e Segurança

A API está preparada para autenticação via Spring Security, permitindo configurar permissões por endpoint.
Tokens JWT podem ser facilmente integrados no futuro.
CRUD de Produtos

Endpoints RESTful para criar, ler, atualizar e deletar produtos.
Validações básicas nos modelos para garantir integridade dos dados.
Documentação com Swagger

Endpoints bem documentados para facilitar o consumo por outros desenvolvedores.
Interface gráfica acessível via /swagger-ui.html para visualizar e testar os endpoints.
Estrutura de Pacotes Bem Definida

Controller: Responsável por gerenciar as requisições HTTP.
Service: Contém a lógica de negócios.
Repository: Abstrai o acesso ao banco de dados.
Model: Representa as entidades persistidas no banco de dados.
Config: Gerencia configurações globais da aplicação (ex. segurança, CORS).
Contribuição
Como contribuir:

Realize um fork do repositório.
Crie uma branch para suas alterações.
Faça commits claros e objetivos.
Envie um Pull Request com a descrição do que foi alterado.
Como reportar problemas:

Abra uma issue detalhando o problema encontrado.
Informe o ambiente (versão do Java, banco de dados utilizado, sistema operacional).
Inclua logs, prints de tela ou exemplos de requisições que causem o problema.
Licença
Este projeto está licenciado sob a MIT License. Consulte o arquivo LICENSE para mais detalhes.

Estrutura do Projeto
Visão Geral do Diretório:

arduino
Copiar
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── spring_boot_api_advanced
│   │   │               ├── ApiApplication.java              // Classe principal
│   │   │               ├── config                          // Configurações
│   │   │               │   ├── SecurityConfig.java        // Configuração de segurança
│   │   │               │   └── WebConfig.java             // Configuração web
│   │   │               ├── controller                      // Controladores
│   │   │               │   ├── UserController.java        // Controller para usuários
│   │   │               │   └── ProductController.java     // Controller para produtos
│   │   │               ├── service                         // Serviços
│   │   │               │   ├── UserService.java           // Lógica de negócios de usuários
│   │   │               │   ├── ProductService.java        // Lógica de negócios de produtos
│   │   │               ├── repository                      // Repositórios
│   │   │               │   ├── UserRepository.java        // Repositório de usuários
│   │   │               │   ├── ProductRepository.java     // Repositório de produtos
│   │   │               ├── model                           // Modelos
│   │   │               │   ├── User.java                   // Entidade de usuário
│   │   │               │   ├── Product.java                // Entidade de produto
│   │   │               ├── exception                       // Exceções personalizadas
│   │   │                   ├── CustomException.java         // Exceção personalizada
│   │   │                   └── GlobalExceptionHandler.java   // Tratador de exceções global
│   └── resources
│       ├── application.properties                       // Configurações da aplicação
│       ├── static                                        // Recursos estáticos
│       └── templates                                     // Templates para o frontend (se necessário)
│
├── .gitignore                                             // Arquivo para ignorar arquivos no git
├── build.gradle                                          // Arquivo de configuração do Gradle
└── README.md                                             // Documentação do projeto
Copiar
