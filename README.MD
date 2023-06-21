## SPRING MICROSERVICES DEMO
This is a course about spring microservices with an API Gateway implementation in Eureka, also the demo has implementation of:
* Eureka: Is the Netflix Service Discovery Server and Client
* API Gateway: To call multiples host request on a single host
* Keycloak: The server to secure the API Gateway
* Circuit breaker: Allows microservices to communicate as usual and monitor the number of failures occurring within the defined time period
* Kafka: To have distributed tracing of htrp requests
* Jib: Dependency to dockerize all the submodules in a separate images
* Prometheus and Grafana: Monitoring the microservices 

#### COURSE LINK: https://www.youtube.com/playlist?list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c

#### Aditional steps:
* Set the hosts
    * In windows is in: **C:\Windows\System32\drivers\etc**
    * Add the line: **127.0.0.1 keycloak**
* Dockerize submodules:
    * Add credentials on ~/.m2/setting.xml
    * Run the command to upload images
```xml
<server>
    <id>registry.hub.docker.com</id>
    <username>${username}</username>
    <password>${password}</password>
</server>
```

```console
foo@bar:~$ mvn clean compile jib:build
```

#### HTTP URI'S
* Eureka server: http://localhost:8761/
* Keycloak: http://localhost:8080/
* Zipkin: http://localhost:9411/
* Prometheus: http://localhost:9090/
* Grafana: http://localhost:3000/
* API: http://localhost:8181