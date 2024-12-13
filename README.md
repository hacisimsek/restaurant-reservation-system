# Restaurant Reservation System

## Overview

Restaurant Reservation System is a robust Spring Boot application designed to simplify restaurant table booking and management. The system provides comprehensive features for both customers and restaurant managers, streamlining the reservation process and enhancing overall dining experience.

## Features

### 1. Reservation Management
- Create, update, view, and delete reservations
- Automated email notifications for reservation confirmations

### 2. Table Management
- Manage table availability, capacity, and statuses
- Comprehensive CRUD operations for table management

### 3. Admin Dashboard
- Real-time view of total reservations and available tables
- Essential statistics for restaurant managers

### 4. Security
- Basic authentication using Spring Security
- Secure access to application endpoints

## Technologies Used

- **Programming Language**: Java 17
- **Framework**: Spring Boot
  - Spring Data JPA
  - Spring Web
  - Spring Security
  - Spring Boot Starter Mail
- **Database**: PostgreSQL
- **Utilities**: 
  - Lombok (Simplified Java annotations)
  - Maven (Dependency management)

## Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL database

## Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/hacisimsek/restaurant-reservation-system.git
cd restaurant-reservation-system
```

### 2. Configure Database

Update `src/main/resources/application.properties` with your PostgreSQL credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/restaurantdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.datasource.driver-class-name=org.postgresql.Driver
```

### 3. Configure Email Notifications

Update `application.properties` with your email settings:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### 4. Build and Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

### Reservation Endpoints
- `GET /api/reservations`: Retrieve all reservations
- `GET /api/reservations/{id}`: Retrieve a specific reservation
- `POST /api/reservations`: Create a new reservation
- `PUT /api/reservations/{id}`: Update an existing reservation
- `DELETE /api/reservations/{id}`: Delete a reservation

### Table Endpoints
- `GET /api/tables`: Retrieve all tables
- `GET /api/tables/{id}`: Retrieve a specific table
- `POST /api/tables`: Create a new table
- `PUT /api/tables/{id}`: Update an existing table
- `DELETE /api/tables/{id}`: Delete a table

### Admin Dashboard
- `GET /admin/dashboard`: View total reservations and available tables

## Future Enhancements

- SMS notification support using Twilio
- Advanced user roles and authentication
- Comprehensive analytics and reporting features

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` file for more information.

## Contact

Project Maintainer - [Your Name/Email]

Project Link: [Repository URL]
