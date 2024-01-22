## Project Name: JWT Authentication with Spring Boot and MySQL

### Overview
This Spring Boot project demonstrates the implementation of JSON Web Token (JWT) authentication with a MySQL database. JWT is used for secure and stateless authentication, while MySQL serves as the backend database for storing user credentials.

### Technologies Used
- Framework: Spring Boot
- Authentication: JWT
- Database: MySQL

### Features

1. **JWT Authentication**
    - Secure user authentication using JSON Web Tokens.
    - Token generation and verification mechanisms.

2. **User Registration and Login**
    - Endpoints for user registration and login.
    - Passwords securely stored in the MySQL database.

3. **Role-Based Access Control**
    - Implementation of roles (e.g., USER, ADMIN) for different levels of access.
    - Authorization based on user roles.

4. **MySQL Database Integration**
    - User information stored in a MySQL database.
    - Hibernate for ORM (Object-Relational Mapping) between Java objects and database entities.

### How to Run

1. **MySQL Setup**
    - Ensure MySQL is installed and running.
    - Create a database for the application, and update database configuration in `application.properties`.

2. **Clone Repository**
    ```bash
    git clone https://github.com/your-username/jwt-spring-boot-mysql.git
    cd jwt-spring-boot-mysql
    ```

3. **Build and Run the Application**
    ```bash
    mvn clean install
    java -jar target/your-application.jar
    ```

### Usage

1. **User Registration**
    - Use the `/register` endpoint to register a new user.

2. **User Login**
    - Use the `/login` endpoint to obtain a JWT token after providing valid credentials.

3. **Access Secured Endpoints**
    - Include the JWT token in the Authorization header to access secured endpoints.
    - Example: `Authorization: Bearer YOUR_JWT_TOKEN`
