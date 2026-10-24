# TrustVault — Secure Document Management System

TrustVault is a web-based document management application built with Java and Spring Boot. It helps authenticated users manage documents, control access, share documents with registered users, revoke permissions, and maintain an audit trail of important document activities.

The application also includes an AI-powered question-answering feature that allows authorized users to ask questions about document content.

## Problem Statement

Confidential documents need secure storage, controlled sharing, and accountability. Unrestricted access can expose sensitive information, while the absence of audit records makes it difficult to understand how documents are accessed.

TrustVault aims to address these challenges through authentication, document ownership checks, access control, sharing and revocation workflows, audit logging, and AI-assisted document interaction.

## Objectives

- Provide user registration and login.
- Protect user passwords using BCrypt hashing.
- Restrict document access based on ownership and granted permissions.
- Enable document sharing with registered users.
- Allow document owners to revoke previously granted access.
- Record important document activities in audit logs.
- Support document file handling.
- Provide AI-assisted question answering for accessible documents.
- Offer a simple browser-based user interface.

## Technology Stack

| Component | Technology |
|---|---|
| Backend | Java, Spring Boot |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL |
| Data access | Spring Data JPA / Hibernate |
| Authentication | Session-based authentication |
| Password security | BCrypt |
| Input validation | Jakarta Bean Validation |
| AI integration | Google Gemini API |
| JSON processing | Jackson ObjectMapper |
| Build tool | Maven |

## Features

### 1. User Authentication
- User registration and login.
- Email validation and duplicate-email checks.
- Password hashing using BCrypt.
- Session-based authentication for protected operations.

### 2. Document Management
- Create and retrieve documents.
- Associate documents with their owners.
- Check document ownership and authorized access before serving protected content.

### 3. Document Sharing and Access Control
- Share documents with registered users.
- Restrict access to users with appropriate permissions.
- Revoke previously granted access.
- Check authorization before allowing protected document operations.

### 4. Audit Logging
- Record important document-related actions.
- Track activities such as document creation, opening, sharing, and access revocation.
- Provide audit records that help with accountability and activity review.

### 5. AI-Powered Document Assistant
- Accept questions about document content.
- Integrate with the Google Gemini API to generate answers.
- Check the logged-in user's access to the requested document before processing a question.
- Return the generated answer through the application's API and web interface.

**Note:** AI responses depend on API availability, model limits, network connectivity, and valid API configuration. Generated answers should be verified before being relied upon.

### 6. Document File Handling
- Includes a document file-handling service.
- File upload and download workflows should be validated in the running application before being considered fully verified.

## Security Considerations

- Passwords are hashed rather than stored as plain text.
- Protected operations should enforce authentication and document-level authorization.
- Database credentials and AI API keys should be supplied through environment variables or other secure configuration.
- Uploaded documents and private configuration files should not be committed to the public repository.
- Production deployment requires additional security review, including authorization testing, upload validation, file-size restrictions, error handling, and secure configuration.

## Prerequisites

- Java JDK 25
- MySQL Server
- Git
- Internet access for the Gemini API feature
- A valid Google Gemini API key for AI functionality

## Local Setup and Installation

### 1. Clone the Repository

```bash
git clone https://github.com/kalyani-chinta/TrustVault.git
cd TrustVault
```

Open the terminal in the project directory containing `pom.xml` and `mvnw.cmd`.

### 2. Create the Database

Create a MySQL database:

```sql
CREATE DATABASE trustvault;
```

Configure a MySQL user with the necessary privileges to access the database.

### 3. Configure Environment Variables

The application expects the database password through `DB_PASSWORD`. The AI feature uses `GEMINI_API_KEY`.

In Windows PowerShell, set these variables for the current terminal session:

```powershell
$env:DB_PASSWORD = "your_database_password"
$env:GEMINI_API_KEY = "your_gemini_api_key"
```

Replace the placeholders with your actual credentials. Do not commit real passwords or API keys to GitHub.

Ensure `src/main/resources/application.properties` uses the correct database URL and username and reads the password from the `DB_PASSWORD` environment variable.

### 4. Run the Application

Start the application from the project directory:

```powershell
.\mvnw.cmd spring-boot:run
```

Keep the terminal running while using the application. Ensure the MySQL service is running and the database credentials are valid.

### 5. Open the Application

Visit:

http://localhost:8080/

The application runs locally on your computer. This address is not a public deployment URL.

## Testing and Validation

Core workflows tested during development include:

- User registration and login.
- Document creation and retrieval.
- Sharing a document with another registered user.
- Revoking document access.
- Checking audit log records through the API.
- Sending an AI question and receiving a generated answer.

Further validation is required for the complete file upload/download lifecycle, unauthorized-access scenarios, error handling, and production deployment.

## Project Status

TrustVault is a work in progress. Core document management, sharing, access revocation, audit logging, and the AI question-answering workflow have been exercised locally.

File-handling validation, comprehensive security testing, deployment, and live-environment verification remain important next steps.

## Future Enhancements

- Complete and validate secure file upload and download.
- Improve document search and organization.
- Provide a dedicated audit log interface.
- Strengthen security testing and input validation.
- Improve error handling and user experience.
- Deploy the application to a suitable hosting platform.
- Add further monitoring and reliability improvements.

## Repository

GitHub: https://github.com/kalyani-chinta/TrustVault
