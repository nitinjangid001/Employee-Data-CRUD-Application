# Employee Data CRUD Application

This is a simple Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing employee data. The application uses Spring Data JPA to interact with a relational database.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
 

## Features

- Create new employee data
- Retrieve a list of all employees
- Retrieve details of a specific employee
- Update employee information
- Delete employee data

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- MySQL database (or any other relational database)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-crud-app.git
   ```

2. Navigate to the project directory:

   ```bash
   cd employee-crud-app
   ```

3. Build the project:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   java -jar target/employee-crud-app.jar
   ```

The application should now be running on `http://localhost:8080`.

## Usage

You can use any API testing tool (e.g., Postman) to interact with the CRUD endpoints. Below are the available endpoints.

## Endpoints

- **Create Employee:** `POST /insert`
- **Read All Employees:** `GET /read`
- **Read Single Employee:** `GET /read-single/{id}`
- **Update Employee:** `PUT /update/{id}`
- **Delete Employee:** `DELETE /delete/{id}`
 
## Contributing

Feel free to contribute to the development of this CRUD application. If you find any issues or have suggestions, please open an issue or submit a pull request.
 
