# Basic REST Docker

This project is a basic Java REST webservice using Spring Boot, created to learn REST, Dockerfiles, Dockercompose

## Features

- A simple REST endpoint `GET /helloworld` that returns a JSON object with an ID and a helloWorld message.
- Dockerfile for building a Docker image of the Spring Boot application.
- Docker Compose configuration to run the service locally.

### Prerequisites

- Java 17
- Maven
- Docker
- Docker Compose

### Running the Application

#### Without Docker

1. Clone the repository:
   ```bash
   git clone https://github.com/DeaDurro/basic-rest-docker.git
   cd basic-rest-docker
2. Set the property of docker compose on the 'application.properties' to be disabled:
   spring.docker.compose.enabled=false
3. Build and run the appplication
   mvn clean install
   mvn spring-boot:run
4. Acess the endpoint: curl http://localhost:8085/helloworld
   
#### With Docker

1. Build the docker image: docker build -t spring-boot-app .
2. Create .env file with the port configuration TEST_WEBSERVICE_PORT=8085
3. Run the application using docker compose: docker-compose up
4. Acess the endpoint in two ways:
5. either by curl http://localhost:8085/helloworld
6. or by calling the bash script (call-test-rest.sh)
    - ensure the script is executable: chmod +x call-test-rest.sh
    - run the script bash call-test-rest.sh
