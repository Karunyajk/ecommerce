# 🛒 E-Commerce Application

A full-stack E-Commerce web application built using **Java, Spring Boot, Spring Security, MySQL, HTML, CSS, and JavaScript**.

This project provides user authentication, product management, and order management through RESTful APIs with a web-based frontend.

## 🚀 Features

- 👤 User Registration
- 🔐 User Login & Authentication
- 🛍️ Product Management
- 📦 Product CRUD Operations
- 🧾 Order Management
- 🔒 Spring Security
- 🌐 RESTful APIs
- 💾 MySQL Database
- 🎨 Web-based Frontend
- 📱 Responsive User Interface

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven

### Frontend
- HTML5
- CSS3
- JavaScript

### Database
- MySQL

### Tools
- Visual Studio Code
- Git & GitHub
- Postman

## 📁 Project Structure

```text
ecommerce/
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/karunya/ecommerce/
│       │       ├── controller/
│       │       │   ├── AuthController.java
│       │       │   ├── OrderController.java
│       │       │   └── ProductController.java
│       │       ├── model/
│       │       │   ├── Order.java
│       │       │   ├── Product.java
│       │       │   └── User.java
│       │       ├── repository/
│       │       ├── service/
│       │       ├── SecurityConfig.java
│       │       └── EcommerceApplication.java
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── products.html
│           │   └── style.css
│           └── application.properties
├── Dockerfile
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
