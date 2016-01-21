# Spring Data Rest Studies - Infinite Recursion Bug


This project is a study implementation of the [Spring Data Rest](http://shop.oreilly.com/product/9780596805838.do) to show a small bug that happens when you try to perform a GET in a resource that have circular reference in JPA entities, using the header 'Accept' as 'application/schema+json' .

## Quickstart

From the command line do:

```
mvn clean package spring-boot:run
```

The application will run the unit tests and will break


OR

```
mvn clean package spring-boot:run -DskipTests
```

and after it starts, try to performa a curl:

```
curl -H 'Accept:application/schema+json' http://localhost:8080/books
```
## Project description

The project uses latests version of :

- [Spring Data REST](http://github.com/spring-projects/spring-data-rest) - 2.5.0.BUILD-SNAPSHOT