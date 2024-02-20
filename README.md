
# Projeto de CRUD com API para E-commerce usando Java e Spring

Este projeto consiste em uma aplicação de CRUD (Create, Read, Update, Delete) para um sistema de E-commerce, desenvolvido utilizando Java e o framework Spring. A arquitetura segue boas práticas, incorporando Controller, DTO (Data Transfer Object), camada de serviço e um banco de dados H2 (em memória) para persistência dos dados.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## Estrutura do Projeto

- **controller**: Contém a classe responsável por lidar com as requisições HTTP, chamando métodos da camada de serviço e retornando as respostas adequadas.

- **dto**: Neste pacote, são definidos os DTOs que são utilizados para transferir dados entre a camada de controller e a camada de serviço, ajudando a desacoplar as entidades de negócio das representações dos dados que são expostas pela API.

- **entities/**: Aqui são definidas as entidades da aplicação.

- **repository/**: Contém a interface responsável por acessar e manipular os dados no banco de dados. Utilizei o Spring Data JPA para simplificar a implementação dessas operações.

- **service/**: Neste pacote são implementadas as regras de negócio da aplicação. As classes contidas realizam as operações necessárias nos modelos de dados.

## Configuração do Banco de Dados

O banco de dados utilizado neste projeto é o H2 Database, um banco de dados SQL em memória. As configurações de conexão podem ser encontradas no arquivo `application.properties` dentro da pasta `resources`.

## Executando a Aplicação

Para executar a aplicação, basta importar o projeto em sua IDE e executar a classe `CommerceApplication.java`. Certifique-se de ter o Apache Maven instalado para resolver as dependências do projeto.

Após a inicialização, a API estará disponível em [http://localhost:8080](http://localhost:8080).

## Endpoints Disponíveis

- **GET /products**: Retorna todos os produtos cadastrados.
- **GET /products/{id}**: Retorna o produto com o ID especificado.
- **POST /products**: Cria um novo produto.
- **PUT /products/{id}**: Atualiza o produto com o ID especificado.
- **DELETE /products/{id}**: Remove o produto com o ID especificado.

