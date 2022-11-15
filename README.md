# PersonaBACKEND

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven 3](https://maven.apache.org)
- PostgreSQL

You will need to setup your own database or create a database with the following configuration
```
spring.datasource.url=jdbc:postgresql://localhost:5432/persona-db
spring.datasource.username=postgres
spring.datasource.password=admin
```
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `xyz.yoandroide.persona.PersonaBackendApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

### Running port
- default spring boot config
  http://localhost:8080/

### Swagger url
- default swagger url
  http://localhost:8080/swagger-ui/

## About this project
You can download the front-end project [personafront](https://github.com/guerreroeileen/personafront) or get more information in Yo Androide [Curso completo de SPRING BOOT CRUD + JPA + POSTGRESQL +REST + Angular
](https://yoandroide.xyz/curso-completo-de-spring-boot-crud-jpa-postgresql-rest-angular/)
