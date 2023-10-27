# Banking Application SDA

This project is a banking application system management built with Java and Spring Boot, following REST API best practices. It provides all CRUD operations and implements various routes for GET, POST, PUT/PATCH, and DELETE actions. The application utilizes a MYSQL database to store and manage data through JPA in the Java application. Bearer authentication is implemented for secure access to the system.

## Description of the Project
The banking application system management aims to provide a comprehensive solution for managing banking operations. It allows users to perform various banking tasks such as creating accounts, making transactions, managing customer information, and generating reports. The system provides a secure and efficient way to handle banking operations.

## Class Diagram
Please refer to the following class diagram to visualize the structure and relationships of the classes in the banking application system management:

```
[Insert your class diagram here]
```

## Setup
To set up the project locally, follow these steps:

1. Clone the repository from [repository URL].
2. Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) if not already installed.
3. Install [MySQL](https://www.mysql.com/downloads/) database server if not already installed.
4. Create a new database in MySQL for the application.
5. Update the database configuration in `application.properties` file with your MySQL database credentials.
6. Build the project using your preferred build tool (e.g., Maven or Gradle).
7. Run the application using the command `java -jar <path-to-jar-file>`.

## Technologies Used
The following technologies are used in this project:

- Java: Programming language for the backend application.
- Spring Boot: Framework for building Java applications.
- MySQL: Relational database management system.
- JPA (Java Persistence API): Standard specification for accessing databases in Java applications.
- REST API: Architectural style for building web services.
- Bearer Authentication: Authentication mechanism using bearer tokens.

## Controllers and Routes Structure
The application follows a structured approach for defining controllers and routes. The routes are mapped to corresponding controller methods to handle different HTTP requests. Below is an example of the routes structure:

- `GET /api/accounts`: Retrieve all accounts.
- `POST /api/accounts`: Create a new account.
- `GET /api/accounts/{id}`: Retrieve an account by ID.
- `PUT /api/accounts/{id}`: Update an account by ID.
- `DELETE /api/accounts/{id}`: Delete an account by ID.

Please refer to the source code for the complete list of routes and their corresponding controllers.

## Extra Links
- [Trello Board](https://trello.com/your-trello-board): Track the project's progress and tasks on Trello.
- [Presentation Slides](https://slideshare.net/your-presentation): Access the presentation slides for the project.

## Future Work
Here are some potential areas for future enhancements and improvements:

- Implement additional banking features such as fund transfers, bill payments, and account statements.
- Enhance security measures by implementing encryption and further authentication mechanisms.
- Integrate with external services such as payment gateways and credit bureaus.
- Implement a frontend application for a complete user interface.

## Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MySQL Documentation](https://dev.mysql.com/doc/)

## Team Members
- John Doe (Team Lead, Backend Developer)
- Jane Smith (Frontend Developer)
- Alex Johnson (Database Administrator)
- Lisa Thompson (Quality Assurance)

