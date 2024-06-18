1.USER REGISTRATION AND MANAGEMENT APPLICATION- This Spring Boot application provides APIs for user registration and fetching user details by username. It uses MySQL as the database and Maven for dependency management.

2.TECHNOLOGIES USED- Java 17 Spring Boot 3.3.0 MySQL Maven Postman (for API testing)

3.SETUP INSTRUCTIONS- Java Development Kit (JDK) 17: Ensure you have Java 17 installed on your machine. You can download it from Oracle's website or use OpenJDK. Maven: Maven is used for dependency management and build automation. Install Maven from Maven's official website and follow the installation instructions. MySQL Server: Install MySQL on your machine. You can download it from MySQL's website or use a Docker container if preferred. Postman: Postman is optional but useful for testing APIs. You can download it from Postman's website.

4.STEPS TO RUN THE APPLICATION- 1.Clone the repository: git clone https://github.com/your-username/registration-app.git cd registration-app 2.Database Configuration: Create a MySQL database named registration_app using code- CREATE DATABASE registration_app;

Configure the database username and password in application.properties located at src/main/resources using code- spring.datasource.url=jdbc:mysql://localhost:3306/registration_app spring.datasource.username=your-username spring.datasource.password=your-password spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

5.BUILD AND RUN THE APPLICATION: first install the maven using- mvn clean install Run the application using- java -jar target/registration-app-0.0.1-SNAPSHOT.jar Alternatively, you can run the application directly from your IDE by running the RegistrationApplication.java class.

6.ACCESS THE APPLICATION- The application will be accessible at http://localhost:8080. API Endpoints- 1.Register a User: Endpoint: POST /api/user/register Request Body: { "username": "your-username", "email": "your-email@example.com", "password": "your-password" } 2.Fetch User Details: Endpoint: GET /api/user/fetch Request Parameter: username=your-username Testing Use Postman or any API testing tool to test the endpoints. You can import the Postman collection provided in the postman directory of the project for testing.

7.TROUBLESHOOTING- If you encounter any issues, check the application logs for more details (application.log). Ensure that MySQL server is running and accessible.

