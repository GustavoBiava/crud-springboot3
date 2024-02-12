# Projeto: Crud com Spring Boot

O projeto foi construído ao decorrer das aulas do curso CRUD Completo com Spring Boot REST API da plataforma Jdev Treinamento. O principal objetivo do projeto foi construir um CRUD utilizando Spring Boot no back-end, implementando também o front-end com HTML, CSS e JavaScript.

## Objetivos específicos
- Implementar operações de CRUD
- Conhecer e utilizar o JQuery
- Estruturar camadas lógicas: controller, service, repository
  
## Imagens do projeto:

### Formulário principal
![Formulário principal](https://raw.githubusercontent.com/GustavoBiava/crud-springboot3/main/assets/MainForm.png)

### Modal de pesquisa de usuário
![Modal de pesquisa de usuário](https://raw.githubusercontent.com/GustavoBiava/crud-springboot3/main/assets/Modal.png)

## Tecnologias utilizadas
- Java
- Spring Boot
- PostgreSQL
- Maven
- JPA/Hibernate
- JavaScript
- JQUery
- HTML
- CSS
- Bootstrap

## Como rodar?

### Requisitos:
- Java Runtime Environment (Java RE)
- Apache Maven

#### 1 - Inicie um repositório git e dê um git clone no repositório:
```
git init
git clone https://github.com/GustavoBiava/crud-springboot3.git
```
#### 2 - Dentro do diretório do projeto utilizando o CMD ou Git Bash digite o código abaixo para rodar a aplicação Spring Boot via Maven
```
mvn spring-boot:run
```
#### 3 - Feito isso acesse essa URL em seu browser e utilize o CRUD
```
http://localhost:8080/crud-jdev/
```
### Observações!
- Caso deseje mudar a porta em que a aplicação roda, altere o valor da propriedade <b>server.port</b> informando a porta desejada
- Caso deseje encerrar a aplicação, aperte Ctrl + C e confirme a parada no terminal
- Mude as configurações do banco de dados dentro do arquivo <b>application.properties</b>, presente no diretório: <b>crud-springboot3/src/main/resources/application.properties</b>
#### Arquivo application.properties
```
#PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:{SUA_PORTA}/{NOME_DO_SEU_BANCO}
spring.datasource.username={SEU_USUARIO}
spring.datasource.password={SUA_SENHA}
spring.jpa.hibernate.ddl-auto=create

#Context Config
server.servlet.context-path=/crud-jdev

server.port=8080
```


## Agradecimentos
Agradeço primeiramente ao Prof. Alex Fernando Egídio por sua dedicação durante as aulas, e agradeço também você leitor por sua atenção. Obrigado!
