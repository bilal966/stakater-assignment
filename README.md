# :zap: stakater-assignment
This assignment have front-end and back-end application.Log4j2 is integrated with all modules and logback excluded.

![GitHub repo size](https://img.shields.io/github/repo-size/bilal966/stakater-assignment?style=plastic)
![GitHub pull requests](https://img.shields.io/github/issues-pr/bilal966/stakater-assignment?style=plastic)
![GitHub Repo stars](https://img.shields.io/github/stars/bilal966/stakater-assignment?style=plastic)
![GitHub last commit](https://img.shields.io/github/last-commit/bilal966/stakater-assignment?style=plastic)

## Stakater Service Registery - Eureka
- server port 8761
- To Run application:
```sh
mvn spring-boot:run
```
[To access Eureka dashboard:](http://localhost:8761/) [http://localhost:8761/]


## Stakater Backend Service
- server port 8080
- To Run application:
```sh
mvn spring-boot:run
```
- To Enable Async logging for all loggers:  
```sh
mvn spring-boot:run -DLog4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
```
##### JUnuit Test coverage : 91.5%
#### Endpoints Exposed :

[Greetings:](http://localhost:8080/greeting) [http://localhost:8080/greeting]

[Health check:](http://localhost:8080/actuator/health) [http://localhost:8080/actuator/health]

[Show all the metrics:](http://localhost:8080/actuator/metrics) [http://localhost:8080/actuator/metrics]

Build Docker:
```sh
docker build -f Dockerfile -t stakater-backend-application-0.0.1-SNAPSHOT
```

## Stakater Frontend Service
- server port 8081
- To Run application:
```sh
mvn spring-boot:run
```
#### Endpoints Exposed :
[Index:](http://localhost:8081/greeting) [http://localhost:8081/ OR http://localhost:8081/welcome]

[Health check:](http://localhost:8081/actuator/health) [http://localhost:8081/actuator/health]

[Show all the metrics:](http://localhost:8081/actuator/metrics) [http://localhost:8081/actuator/metrics]

Command to build the docker image:
```sh
docker build -f Dockerfile -t stakater-frontend-application-0.0.1-SNAPSHOT
```
List Docker images:
```sh
docker images
```


## Time to develop
- almost 6 hours consumed to implement this modules.
