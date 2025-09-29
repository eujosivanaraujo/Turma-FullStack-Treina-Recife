# 🚀 Módulo 06 - Spring Boot

Este módulo é dedicado à criação de aplicações **Spring Boot** com foco em APIs REST, integração com banco de dados e boas práticas no desenvolvimento backend.

---

## 📌 Instruções

### Requisitos
- **Java JDK 17+**
- **Maven** ou **Gradle**
- **Spring Initializr**
- **MySQL**
- IDE recomendada: **Visual Studio Code**

### Criando um Projeto Spring Boot
1. Acesse o [Spring Initializr](https://start.spring.io).
2. Configure:
   - **Project:** Maven Project
   - **Language:** Java
   - **Spring Boot:** versão estável mais recente
   - **Dependencies:** Spring Web, Spring Data JPA, Lombok, Springdoc OpenAPI
3. Clique em **Generate**, extraia o projeto e abra na sua IDE.

---

## 📚 Conteúdos Abordados

- Criando um projeto Spring Boot (**Spring Web - API REST**)
- Tipos de Parâmetros (**@PathVariable e @RequestParam**)
- Projeto de Gerenciamento de Tarefas (**taskify-api**)
- Introdução ao **Spring MVC**
- Integração com Banco de Dados (**Spring Data JPA**)
- Tratamento de **erros e exceções**
- Documentação com **Swagger OpenAPI**

---

## ⚡ Exemplos de Anotações Utilizadas

```java
// Controller básico com parâmetros
@RestController
@RequestMapping("/product")
public class ProductController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @GetMapping()
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
    .
    .
    .

