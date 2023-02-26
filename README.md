# Mapping

## Frameworks and Language Used:

-Java 11

-Spring Boot 2.5.5

-MySQL Workbench

-Swagger


## Data Flow-

### Controller:

LaptopController: Handles the CRUD operations for Laptop model.

StudentController: Handles the CRUD operations for Student model.

CourseController: Handles the CRUD operations for Course model.

BookController: Handles the CRUD operations for Book model.

### Services:

LaptopService: Implements business logic for Laptop model.

StudentService: Implements business logic for Student model.

CourseService: Implements business logic for Course model.

BookService: Implements business logic for Book model.

### Repository:

LaptopRepository: Contains methods for CRUD operations on Laptop model.

StudentRepository: Contains methods for CRUD operations on Student model.

CourseRepository: Contains methods for CRUD operations on Course model.

BookRepository: Contains methods for CRUD operations on Book model.


## Database Design:

Four entities are present: Laptop, Student, Course, and Book.

Laptop and Student have a one-to-one relationship.

Course and Student have a many-to-many relationship.

Book and Student have a many-to-one relationship.

### Data Structure Used

ArrayList: Used in Course entity for storing Student entities.

## Project Summary:

The Mapping project is a Spring Boot project that showcases the implementation of one-to-one, one-to-many, many-to-one, and many-to-many relationships in a Spring Boot application. The project also demonstrates the usage of embedded models. The project has implemented CRUD operations for each model. MySQL Workbench has been used as the database management system, and Swagger has been used to create the API documentation.
