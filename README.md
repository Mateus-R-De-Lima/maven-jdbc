# CadastroApp

Sistema simples de cadastro utilizando Java, PostgreSQL e Maven.
## 📌 Descrição

Este projeto tem como objetivo demonstrar operações básicas de CRUD (Create, Read, Update, Delete) em Java, com conexão a um banco de dados PostgreSQL.
## ☕ Dependências (Maven)

Este projeto utiliza o **Maven** para gerenciar dependências. Certifique-se de que o Maven esteja instalado.

No seu `pom.xml`, adicione o seguinte para incluir o driver JDBC do PostgreSQL:

```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.5</version>
    </dependency>
</dependencies>


 ```

## 🧱 Estrutura

- `CadastroApp.java` — Classe principal, responsável por executar a aplicação.
- `CadastroModel.java` — Classe que representa o modelo de dados (nome, idade, id).
- `CadastroRepository.java` — Classe que executa as operações no banco de dados.
- `JDBCPostgresql.java` — Classe responsável por conectar ao banco de dados PostgreSQL.

## 💾 Funcionalidades

- ✅ Conectar ao banco de dados
- ✅ Criar novo cadastro
- ✅ Alterar cadastro existente
- ✅ Buscar cadastro por ID
- ✅ Listar todos os cadastros
- ✅ Excluir cadastro por ID

## ⚙️ Requisitos

- Java 8 ou superior
- PostgreSQL instalado
- Driver JDBC do PostgreSQL (instalado via Maven)


## 🚀 Como executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seuusuario/CadastroApp.git
    cd CadastroApp
    ```

2. Configure a conexão com o banco em `JDBCPostgresql.java`.

3. Compile o projeto:
    ```bash
    javac CadastroApp.java
    ```

4. Execute:
    ```bash
    java CadastroApp
    ```

## 📌 Observação

As operações de banco de dados estão comentadas no código-fonte. Basta descomentar conforme o teste que deseja realizar.

## 🧑‍💻 Autor

Desenvolvido por Mateus Lima.

---

