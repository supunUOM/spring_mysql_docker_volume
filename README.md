# Spring Boot with MySQL Docker Volume Sample Application

This repository contains a sample Spring Boot application connected to a MySQL database using Docker Compose. It demonstrates how to set up a development environment for a Spring application along with a MySQL database using Docker volumes.

## Prerequisites

Before you begin, ensure you have the following installed:

- Docker: [Install Docker](https://docs.docker.com/get-docker/)
- Docker Compose: [Install Docker Compose](https://docs.docker.com/compose/install/)

## Getting Started

1. Clone this repository:

   ```sh
   git clone https://github.com/your-username/your-spring-mysql-app.git
   cd your-spring-mysql-app

### 2. Update the docker-compose.yml file:

   - Replace your-spring-app-image:tag with the actual image and tag of your Spring Boot application.
   #### ==== OR ====
   - You can use the ```docker-compose up --build``` command to automatically build the specified tag related image mentioned in the docker-compose file.
### 3. Run the application:
      docker-compose up
   - This command will start the Spring Boot application and the MySQL database. It will create a Docker network to connect the services.
### 4. Access the application:

   - Spring Boot App: http://localhost:8080
   - MySQL Database: 
     - Host: localhost
     - Port: 3306
     - Username: springuser
     - Password: spring_password
     - Database: springdb
  
### 5. Stop and clean up:
   - When you're done, stop the application using:
       ```sh
      docker-compose down
   - This command will stop and remove the containers, but your data will persist in the Docker volumes.

### 6. Configuration
   - The Spring Boot application's configuration can be found in the application.properties file. Update the database connection properties as needed.

### 7. Notes
  - The MySQL data is stored in Docker volumes, ensuring that the data persists even if containers are stopped and restarted.
  - Make sure your Spring Boot application connects to the database using the appropriate configuration.
  - For production deployments, consider more secure practices, such as using environment variables for sensitive data.

### 8. License
  - This project is licensed under the MIT License.