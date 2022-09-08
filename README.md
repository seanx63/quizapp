# quizapp
Java & React RESTful quiz website using Spring, Spring Boot, JPA, MySQL, and Hibernate.
## How to host:
### Backend:
Start a mysql server with the default port (3306). By default a database called quizdb is created with the username and password "root".

This can be changed in the [properties file](src/main/resources/application.properties).

Windows: `.\mvnw.cmd spring-boot:run`

Linux/MacOS `./mvn spring-boot:run`
### Frontend:
See the [client README](client/README.md)
