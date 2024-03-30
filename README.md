## Descrição

O projeto consiste em uma aplicação web utilizando Spring Boot para o back-end e MongoDB como banco de dados NoSQL.

## Requisitos

- Java 21
- Maven
- MongoDB

## Como Executar

1. Clone este repositório.
2. Certifique-se de ter o Java 21 e o MongoDB instalados.
3. Execute o comando `mvn spring-boot:run` na raiz do projeto.

## Dependências

O projeto utiliza as seguintes dependências:

- Spring Boot Starter Web
- Spring Boot Starter Data MongoDB
- Spring Boot Starter Test

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

# API de Usuários

Esta é uma API RESTful para gerenciar usuários e seus posts.

## Endpoints de Usuários

### GET /users

Retorna uma lista de todos os usuários.

### GET /users/{id}

Retorna um usuário específico com base no ID fornecido.

### POST /users

Cria um novo usuário com base nos dados fornecidos no corpo da requisição.

### PUT /users/{id}

Atualiza um usuário existente com base no ID fornecido e nos dados fornecidos no corpo da requisição.

### DELETE /users/{id}

Exclui um usuário com base no ID fornecido.

### GET /users/{id}/posts

Retorna uma lista de posts de um usuário específico com base no ID fornecido.

## Endpoints de Posts

### GET /posts/{id}

Retorna um post específico com base no ID fornecido.

Exemplo de resposta:
```json
{
    "id": "1",
    "title": "Título do Post",
    "content": "Conteúdo do Post"
}
```
### GET /posts/titlesearch?text={text}

Retorna uma lista de posts que contenham o texto fornecido no título.

#### Exemplo de solicitação:

```http
GET /posts/titlesearch?text=java
```
### GET /posts/fullsearch?text={text}&minDate={minDate}&maxDate={maxDate}

Realiza uma busca completa por posts com base no texto, data mínima e data máxima fornecidos.

#### Exemplo de solicitação:

```http
GET /posts/fullsearch?text=java&minDate=2022-01-01&maxDate=2023-01-01
```
