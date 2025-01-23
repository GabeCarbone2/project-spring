# Video Game List Application

Este projeto foi desenvolvido como parte do Intensivão Java Spring ministrado pelo DevSuperior. Ele consiste em uma aplicação backend que gerencia uma lista de jogos de videogame. O objetivo principal é permitir a consulta, organização e listagem de jogos.

## Tecnologias Utilizadas

- **Java**: : Linguagem principal do projeto.
- **Spring Boot**: Framework utilizado para criação da aplicação.
- **Spring Data JPA**: Para interação com o banco de dados.
- **PostgreSQL**: Banco de dados utilizado no projeto.
- **Maven**: Gerenciador de dependências.


Estrutura do Projeto

## Pacotes Principais

- **entities:** Contém as classes que representam as entidades do banco de dados.

- **repositories:** Interfaces que fazem a interação com o banco de dados usando Spring Data JPA.

- **services:** Camada de serviços que contém a lógica de negócio da aplicação.

- **dto:** Objetos de Transferência de Dados (Data Transfer Objects) para transportar informações entre as camadas.

### Classes Importantes

#### 1. `GameListService`
Responsável por buscar listas de jogos do banco de dados.

**Método Principal:**
- `findAll()`: Retorna todas as listas de jogos em formato `GameListDTO`.

#### 2. `GameService`
Gerencia as operações relacionadas aos jogos individuais.

**Métodos Principais:**
- `findAll()`: Retorna todos os jogos em formato reduzido (`GameMinDTO`).
- `findById(Long id)`: Busca um jogo pelo ID.
- `findByList(Long listId)`: Retorna jogos de uma lista específica.

#### 3. `GameListREpository`

Interface que herda de JpaRepository, fornecendo métodos prontos para interação com a entidade GameList no banco de dados.

## Como Executar o Projeto

### Requisitos
- Java 17+
- Maven
- PostgreSQL

### Passos

1. **Clone o Repositório**:
   ```bash
   git clone <git@github.com:GabeCarbone2/project-spring.git>

## Configure o Banco de Dados:

### Crie um banco de dados no PostgreSQL.

#### Configure as credenciais no arquivo application.properties:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/<NOME_DO_BANCO>
spring.datasource.username=<SEU_USUARIO>
spring.datasource.password=<SUA_SENHA>
spring.jpa.hibernate.ddl-auto=update
```

### Instale as Dependências:

```properties
mvn install
```

### Execute a Aplicação:
```properties
mvn spring-boot:run
```

### Acesse o Projeto:

Use uma ferramenta como o Postman ou um navegador para testar os endpoints da API.

### **7. Contribuições**
Este projeto foi desenvolvido com o apoio do curso **Intensivão Java Spring**. Todos os créditos ao **DevSuperior** pelo conteúdo educacional de alta qualidade.
