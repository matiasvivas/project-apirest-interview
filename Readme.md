# Spring Boot, MySQL, JPA, Hibernate Rest API Dummy Interview

Build Restful CRUD API for a simple Dummy application using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/matiasvivas/project-apirest-interview.git
```

**2. Create Mysql database**
```bash
create database notes_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs form Dummy entity.

    GET /api/dummy
    
    POST /api/dummy
    
    GET /api/dummy/{dummyId}
    
    PUT /api/dummy/{dummyId}
    
    DELETE /api/dummy/{dummyId}

The app defines following CRUD APIs for ExtraDummy entity.

    GET /api/extradummy
    
    POST /api/extradummy
    
    GET /api/extradummy/{extraDummyId}
    
    PUT /api/extradummy/{extraDummyId}
    
    DELETE /api/extradummy/{extraDummyId}

You can test them using postman or any other rest client.
