 JDBC Contact Management System

## Overview
This Java project implements a simple Contact Management System using JDBC (Java Database Connectivity) to interact with a MySQL database. It allows users to perform CRUD (Create, Read, Update, Delete) operations on a database of contacts.

## Features
- Add a new contact
- Retrieve a contact by ID
- List all contacts
- Update an existing contact
- Delete a contact

## Project Structure
- **com.jdbcProject:** Main package containing the core classes of the project.
  - **ConnectionFactory:** Establishes a connection with the MySQL database.
  - **ContactManager:** Main class to interact with the user and manage contact operations.
- **com.jdbcProject.models:** Contains the Contact class representing a contact entity.
- **com.jdbcProject.dao:** Contains the DAO (Data Access Object) interfaces and implementations.
  - **Dao:** Generic interface defining CRUD operations.
  - **ContactDaoImpl:** Implementation of the DAO interface for the Contact class.
- **com.jdbcProject.teste:** Contains the JdbcTest class for testing the project functionality.

## Setup
1. Ensure you have MySQL installed on your system.
2. Create a MySQL database named `fj21`.
3. Create a table named `contatos` with columns `id`, `nome`, `email`, `endereco`, and `dataNascimento`.
4. Update the `dbconnection.properties` file with your MySQL connection details.
5. Build and run the project.

## Usage
1. Run the `JdbcTest` class.
2. Follow the on-screen instructions to perform contact operations.

## Dependencies
- Java SE Development Kit (JDK)
- MySQL Connector/J

## Technologies Used
- Java
- JDBC
- MySQL
