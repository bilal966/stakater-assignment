# stakater-assignment
This assignment have front-end and back-end application.Log4j2 is integrated with all modules and logback excluded.

#Stakater Service Registery - Eureka
- server port 8761
To Run application:
```sh
mvn spring-boot:run
```
To access Eureka dashboard:
[http://localhost:8761/]


#Stakater Backend Service
- server port 8080
To Run application:
```sh
mvn spring-boot:run
```
To Enable Async logging for all loggers:
```sh
mvn spring-boot:run -DLog4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
```
[Health check:](http://localhost:8080/actuator/health)
Show all the metrics:
[http://localhost:8080/actuator/metrics]

docker build -f Dockerfile -t stakater-backend-application-0.0.1-SNAPSHOT

#Stakater Frontend Service
- server port 8081
To Run application:
```sh
mvn spring-boot:run
```
Health check:
[http://localhost:8081/actuator/health]
Show all the metrics:
[http://localhost:8081/actuator/metrics]
Command to build the docker image:
```sh
docker build -f Dockerfile -t stakater-frontend-application-0.0.1-SNAPSHOT
```
List Docker images:
```sh
docker images
```
