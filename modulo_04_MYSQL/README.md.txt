# Módulo 4 - Banco de Dados MySQL

Este módulo contém os projetos e exemplos relacionados ao **MySQL**, incluindo a criação de bancos de dados, tabelas e inserção de dados.

## Conteúdo

- `curso_fullstack_aluno.sql` → Arquivo SQL exportado do MySQL Workbench, contendo a tabela `aluno` com estrutura e dados de exemplo.
- Exercícios práticos de criação de banco, tabelas e consultas em sala de aula.

## Estrutura do Banco de Dados

Tabela: **aluno**

| Coluna           | Tipo           | Restrição              |
|-----------------|----------------|-----------------------|
| id               | INT            | AUTO_INCREMENT, PK     |
| nome             | VARCHAR(100)   | NOT NULL               |
| cpf              | BIGINT(11)     | NOT NULL, UNIQUE       |
| telefone         | BIGINT(11)     | NOT NULL               |
| email            | VARCHAR(100)   | NOT NULL, UNIQUE       |
| data_nascimento  | DATE           |                        |


## Como usar o banco

1. Abra o **MySQL Workbench** ou outro MySQL.
2. Execute o arquivo SQL `curso_fullstack_aluno.sql` para criar o banco e a tabela com os dados de exemplo:
```sql
SOURCE caminho/para/modulo-4/curso_fullstack_aluno.sql;
