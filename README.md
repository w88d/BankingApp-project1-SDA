# Banking Application SDA

<a name="readme-top"></a>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#class-diagram">Class Diagram</a>
        <ul>
        <li><a href="#technologies-used">Technology Used</a></li>
      </ul>
</li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#how-to-use">How to Use</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributors">Contributors</a></li>
  </ol>
</details>


<svg id="Layer_1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 767.8 768" width="2499" height="2500">
    <style>.st0{fill:#77bc1f}</style>
    <path class="st0"
          d="M698.3 40c-10.8 25.8-24.5 50.3-41 72.8C585.1 40.6 487.1 0 385 0 173.8 0 0 174 0 385.5 0 491 43.2 592 119.6 664.8l14.2 12.6c69.4 58.5 157.3 90.7 248 90.7 200.8 0 369.6-157.4 383.9-358 10.5-98.2-18.3-222.4-67.4-370.1zm-524 627c-6.2 7.7-15.7 12.2-25.6 12.2-18.1 0-32.9-14.9-32.9-33s14.9-33 32.9-33c7.5 0 14.9 2.6 20.7 7.4 14.1 11.4 16.3 32.3 4.9 46.4zm522.4-115.4c-95 126.7-297.9 84-428 90.1 0 0-23.1 1.4-46.3 5.2 0 0 8.7-3.7 20-8 91.3-31.8 134.5-38 190-66.5 104.5-53.2 207.8-169.6 229.3-290.7C621.9 398.2 501.3 498.3 391.4 539c-75.3 27.8-211.3 54.8-211.3 54.8l-5.5-2.9C82 545.8 79.2 345.1 247.5 280.3c73.7-28.4 144.2-12.8 223.8-31.8 85-20.2 183.3-84 223.3-167.2 44.8 133.1 98.7 341.5 2.1 470.3z"/>
</svg>


This project is a banking application system management built with Java and Spring Boot, following REST API best practices. It provides all CRUD operations and implements various routes for GET, POST, PUT/PATCH, and DELETE actions. The application utilizes a MYSQL database to store and manage data through JPA in the Java application. Bearer authentication is implemented for secure access to the system.


## About the Project
The banking application system management aims to provide a comprehensive solution for managing banking operations. It allows users to perform various banking tasks such as creating accounts, making transactions, managing customer information, and generating reports. The system provides a secure and efficient way to handle banking operations.

<!-- CLASS DIAGRAM -->
## Class Diagram
refer to the following class diagram to visualize the structure and relationships of the classes in the banking application system management:


![Untitled](https://github.com/w88d/BankingApp-project1-SDA/assets/140564404/750d5975-4045-4d47-9626-ec78fbf6c717)



<!-- SETUP -->
## Setup
To set up the project locally, follow these steps:

1. Clone the repository from [repository URL].
2. Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) if not already installed.
3. Install [MySQL](https://www.mysql.com/downloads/) database server if not already installed.
4. Create a new database in MySQL for the application.
5. Update the database configuration in `application.properties` file with your MySQL database credentials.
6. Build the project using your preferred build tool (e.g., Maven or Gradle).
7. Run the application using the command `java -jar <path-to-jar-file>`.

<!-- TECHNOLOGIES USED -->
## Technologies Used
The following technologies are used in this project:

- Java: Programming language for the backend application.
- Spring Boot: Framework for building Java applications.
- MySQL: Relational database management system.
- JPA (Java Persistence API): Standard specification for accessing databases in Java applications.
- REST API: Architectural style for building web services.
- Bearer Authentication: Authentication mechanism using bearer tokens.

<!-- CONTROLLER -->
## Controllers and Routes Structure
The application follows a structured approach for defining controllers and routes. The routes are mapped to corresponding controller methods to handle different HTTP requests. Below is an example of the routes structure:

- `GET /api/accounts`: Retrieve all accounts.
- `POST /api/accounts`: Create a new account.
- `GET /api/accounts/{id}`: Retrieve an account by ID.
- `PUT /api/accounts/{id}`: Update an account by ID.
- `DELETE /api/accounts/{id}`: Delete an account by ID.

Please refer to the source code for the complete list of routes and their corresponding controllers.

<!-- EXTRA LINKS -->
## Extra Links
- [Trello Board](https://trello.com/your-trello-board): Track the project's progress and tasks on Trello.
- [Presentation Slides](https://slideshare.net/your-presentation): Access the presentation slides for the project.

<!-- FUTURE WORK -->
## Future Work
Here are some potential areas for future enhancements and improvements:

- Implement additional banking features such as fund transfers, bill payments, and account statements.
- Enhance security measures by implementing encryption and further authentication mechanisms.
- Integrate with external services such as payment gateways and credit bureaus.
- Implement a frontend application for a complete user interface.

<!-- RESOURCES -->
## Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MySQL Documentation](https://dev.mysql.com/doc/)

##  By
- Wedad Alotaibi

