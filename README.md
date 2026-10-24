# TrustVault

## Secure Document Management System

TrustVault is a web-based document management application built to help users create, access, share, and manage documents securely. It uses user authentication, document ownership, access controls, and audit logging to improve document security and accountability.

## Problem Statement

Confidential documents require controlled access and accountability. TrustVault aims to provide a centralized platform where users can manage their documents, share them with registered users, revoke access when necessary, and record important document-related activities.

## Objectives

- Provide user registration and login.
- Protect passwords using BCrypt hashing.
- Enforce document ownership and access restrictions.
- Allow document owners to share documents with registered users.
- Allow owners to revoke previously granted access.
- Record important document activities through audit logs.
- Provide a simple web interface for document management.

## Technology Stack

- **Backend:** Java, Spring Boot
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **Authentication:** Session-based authentication
- **Password Security:** BCrypt
- **Build Tool:** Maven

## Implemented Features

- User registration with email validation and duplicate-email checks.
- Secure password hashing and login credential verification.
- Session handling for authenticated users.
- Document creation and retrieval for the logged-in owner.
- Ownership and access checks when opening documents.
- Sharing documents with registered users using their email addresses.
- Revoking document access previously granted to another user.
- Audit logging for document creation, sharing, opening, and access revocation.
- Web pages for registration, login, and document management.

## Prerequisites

- Java JDK 25
- MySQL Server
- Git (optional, for cloning the repository)

## Local Setup and Run

### 1. Clone the Repository

```bash
git clone https://github.com/kalyani-chinta/TrustVault.git
```

### 2. Open the Project Folder

Open the terminal in the project directory containing `mvnw.cmd` and `pom.xml`.

### 3. Configure the Database

Create a MySQL database named `trustvault`. Configure a MySQL user with the necessary privileges to access this database.

### 4. Configure Database Credentials

Ensure `src/main/resources/application.properties` contains the appropriate database URL and username, and reads the database password from the `DB_PASSWORD` environment variable.

On Windows PowerShell, set the password for the current terminal session:

```powershell
$env:DB_PASSWORD = "your_database_password"
```

Replace the placeholder with your actual MySQL password. Do not commit real database credentials to GitHub.

### 5. Run the Application

In the project directory, execute:

```powershell
.\mvnw.cmd spring-boot:run
```

### 6. Open the Application

Open the following address in your browser:

http://localhost:8080/

The application requires a running MySQL server and valid database credentials.

## Testing

The following core workflows have been tested locally:

- User registration and login.
- Document creation and retrieval.
- Sharing a document with another registered user.
- Revoking a user's document access.
- Checking audit log records through the audit log API.

Further security testing and validation should be completed before production use.

## Project Status

TrustVault is a work in progress. Core document management, sharing, access revocation, and audit logging workflows have been tested locally. Deployment, additional security validation, and further improvements remain pending.

## Future Enhancements

- Document file upload and download.
- Improved document search and organization.
- Enhanced audit log interface.
- Additional security testing and user-interface improvements.
- Production deployment and live application validation.

## Repository

[TrustVault on GitHub](https://github.com/kalyani-chinta/TrustVault)
