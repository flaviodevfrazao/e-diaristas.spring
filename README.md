# Projeto E-Diaristas

Projeto desenvolvido durante a imersãoo da [Treina Web](//www.treinaweb.com.br/) utilizando Java e Spring Boot

## Dependências do Projeto

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- Bean Validation

## Dependêcias de Desenvolvimento

- Spring Boot DevTools
- Lombok

## Requisitos

- Java 18.0.1.1 (OpenJdk)
- Apache Maven 3.8.6

## Como testar esse projeto na minha máquina?

Clone esse repositório e entre na pasta do projeto.

```sh
git clone https://github.com/flaviodevfrazao/e-diaristas.spring.git
cd e-diaristas-spring
```
Atualize as configurações de acesso ao banco de dados no arquivo [application.properties](src/main/resources/application.properties).

```properties
spring.datasource.url=jdbc:mysql://host:porta/banco_de_dados
spring.datasource.username=usuario
spring.datasource.password=senha
```
Execute o projeto através do Maven

```sh
mvn spring-boot:run
```

Acesse a aplicação em [http://localhost:8080/admin/servicos](http://localhost:8080/admin/servicos)