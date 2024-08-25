This microservices app shows how to integrate role based authenticaiton and authorization with JWT through API gateway.
# README for thesisApp

## Introduction

Welcome to the **thesisApp** repository! This project is a microservices-based application built using the **Spring Boot** framework. The application consists of several services including a restaurant service, an authentication service with JWT, an API gateway, and a service registry. Each service is designed to handle specific functionalities within the application, providing a scalable and maintainable architecture.

## Features

- **Restaurant Service**:
  - Provides endpoints to check the status of orders.
  - Uses a simulated DAO for order details.
- **Authentication Service (JWT)**:
  - User registration and login with JWT token generation.
  - Token validation and refresh capabilities.
  - Role-based access control.
- **API Gateway**:
  - Routes requests to appropriate services.
  - Validates JWT tokens for secured endpoints.
- **Service Registry**:
  - Enables service discovery using Eureka.

## Requirements

- **Java 17** or higher
- **Maven 3.6.3** or higher
- **Docker** (optional, for containerized deployment)
- **Spring Boot** dependencies:
  - `spring-boot-starter-web`
  - `spring-boot-starter-security`
  - `spring-cloud-starter-netflix-eureka-client`
  - `spring-cloud-starter-gateway`
  - `spring-boot-starter-data-jpa`
  - `spring-boot-starter-validation`
  - `lombok`

## Usage

### Running the Application

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/metinbicaksiz/thesisApp.git
   cd thesisApp
   ```

2. **Build the Application**:
   ```sh
   mvn clean install
   ```

3. **Run the Services**:
   - **Service Registry**:
     ```sh
     cd service-registry
     mvn spring-boot:run
     ```
   - **Authentication Service**:
     ```sh
     cd auth-service-jwt
     mvn spring-boot:run
     ```
   - **Restaurant Service**:
     ```sh
     cd restaurant-service
     mvn spring-boot:run
     ```
   - **API Gateway**:
     ```sh
     cd api-gateway
     mvn spring-boot:run
     ```
   - **Swiggy Service**:
     ```sh
     cd swiggy-service
     mvn spring-boot:run
     ```

### Accessing Endpoints

- **API Gateway**: `http://localhost:8080`
- **Authentication Service**: `http://localhost:9000`
- **Restaurant Service**: `http://localhost:8091`
- **Swiggy Service**: `http://localhost:8081`

## Configuration

### Application Properties

Each service has its own `application.properties` file located in the `src/main/resources` directory. Key configurations include:

- **Service Registry (service-registry/src/main/resources/application.properties)**:
  ```properties
  spring.application.name=service-registry
  server.port=8761
  ```

- **Authentication Service (auth-service-jwt/src/main/resources/application.properties)**:
  ```properties
  spring.application.name=auth-service-jwt
  server.port=9000
  eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
  application.security.jwt.secret-key=cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e
  application.security.jwt.access-token-expiration=86400000
  application.security.jwt.refresh-token-expiration=604800000
  ```

- **Restaurant Service (restaurant-service/src/main/resources/application.properties)**:
  ```properties
  spring.application.name=restaurant-service
  server.port=8091
  eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
  ```

- **API Gateway (api-gateway/src/main/resources/application.properties)**:
  ```properties
  spring.application.name=api-gateway
  server.port=8080
  eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
  ```

- **Swiggy Service (swiggy-service/src/main/resources/application.properties)**:
  ```properties
  spring.application.name=swiggy-service
  server.port=8081
  eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
  ```

## Installation

### Prerequisites

Ensure you have the following installed:

- **Java 17** or higher
- **Maven 3.6.3** or higher
- **Docker** (optional, for containerized deployment)

### Steps

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/metinbicaksiz/thesisApp.git
   cd thesisApp
   ```

2. **Build the Project**:
   ```sh
   mvn clean install
   ```

3. **Run Docker Containers** (if using Docker):
   - **Build Docker Images**:
     ```sh
     docker build -t service-registry service-registry/.
     docker build -t auth-service-jwt auth-service-jwt/.
     docker build -t restaurant-service restaurant-service/.
     docker build -t api-gateway api-gateway/.
     docker build -t swiggy-service swiggy-service/.
     ```

   - **Run Docker Containers**:
     ```sh
     docker run -d -p 8761:8761 --name service-registry service-registry
     docker run -d -p 9000:9000 --name auth-service-jwt auth-service-jwt
     docker run -d -p 8091:8091 --name restaurant-service restaurant-service
     docker run -d -p 8080:8080 --name api-gateway api-gateway
     docker run -d -p 8081:8081 --name swiggy-service swiggy-service
     ```

---

Feel free to explore the codebase and contribute to the project by submitting pull requests or raising issues. For any questions or support, please reach out.

Happy coding! 🚀
