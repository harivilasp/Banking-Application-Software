# Banking Application Software

[![Stars](https://img.shields.io/github/stars/harivilasp/Banking-Application-Software?style=flat-square)](https://github.com/harivilasp/Banking-Application-Software/stargazers)
[![Forks](https://img.shields.io/github/forks/harivilasp/Banking-Application-Software?style=flat-square)](https://github.com/harivilasp/Banking-Application-Software/network)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)](LICENSE)
![Java](https://img.shields.io/badge/Java-Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)

A secure, full-featured banking application built with Spring Boot. Follows layered MVC architecture with role-based access control for staff and administrators, email notifications for key transactions, and MySQL-backed persistence.

## Features

- **Account Management** — create, update, and delete customer accounts
- **Transactions** — deposits, withdrawals, balance inquiries
- **Role-Based Access** — separate staff and admin privilege levels
- **Email Notifications** — triggered on login and fund transfers
- **Report Generation** — printable transaction and account reports
- **Network Database** — single shared MySQL instance across multiple system nodes

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Frontend | HTML5, Bootstrap |
| Backend | Java, Spring Boot |
| Database | MySQL |
| Architecture | MVC + Layered Architecture |
| Server | Embedded Apache Tomcat |

## Getting Started

### Prerequisites

- Java 8+
- Maven
- MySQL Workbench or CLI
- IDE with Spring Boot support (IntelliJ IDEA / Eclipse / NetBeans)

### Database Setup

1. Open MySQL Workbench
2. Create a database named `database`
3. Import the SQL file: **Server → Data Import → Import from Self-Contained File** → select the `.sql` file in the repo → Execute

### Application Configuration

Open `src/main/resources/application.properties` and set:

```properties
# Database
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD

# Email notifications
spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_EMAIL_PASSWORD
```

### Run

1. Clone the repo and open in your IDE
2. Import as a Maven project (dependencies download automatically)
3. Run as **Spring Boot Application**
4. Open `http://localhost:8080`

### Default Credentials

| Username | Password |
|----------|----------|
| `admin` | `admin` |

## Architecture

This project follows a **Layered (n-tier) Architecture**:

```
Controller (MVC)  →  Service Layer  →  Repository (JPA)  →  MySQL
                           ↓
                    Security Layer (role-based auth)
```

- **Controller** — handles HTTP requests and routes to views
- **Service** — business logic (transaction validation, notification dispatch)
- **Repository** — Spring Data JPA for database operations
- **Security** — Spring Security with role separation (STAFF / ADMIN)

## License

MIT License — see [LICENSE](LICENSE) for details.
