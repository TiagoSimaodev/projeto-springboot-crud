📚 Spring Boot REST API - Gerenciamento de Usuários
Projeto de uma API REST com Spring Boot, Maven e PostgreSQL, realizando operações de CRUD de usuários, integração com Bootstrap, AJAX e deploy no Heroku.

🚀 Funcionalidades
Listar todos usuários

Cadastrar novo usuário

Buscar por ID ou nome

Atualizar usuário

Exclusão lógica (alterar status)

🛠️ Tecnologias
Java 17, Spring Boot 3

Spring Data JPA, Maven

PostgreSQL

Bootstrap 5, JQuery

Heroku

📑 Endpoints

Método Endpoint Ação
GET /api/usuarios Listar todos
POST /api/usuarios Cadastrar usuário
GET /api/usuarios/{id} Buscar por ID
PUT /api/usuarios/{id} Atualizar usuário
DELETE /api/usuarios/{id} Excluir logicamente
GET /api/usuarios/buscar/{nome} Buscar por parte do nome
⚙️ Como rodar
Clone o repositório

Configure o application.properties

Rode com:

bash
Copiar
Editar
./mvnw spring-boot:run
📦 Build e Deploy
Gerar JAR: ./mvnw clean package

Deploy Heroku: git push heroku master
