# TrustVault — Secure Document Management System

TrustVault is a web-based document management application built with Java and Spring Boot. It allows authenticated users to manage documents, share them with registered users, revoke access, and maintain an audit trail of important document activities.

The application also includes an AI-powered question-answering feature that integrates with the Google Gemini API to answer questions about accessible document content.

## Live Demo

**Live Website:** https://trustvault-bplk.onrender.com/

**GitHub Repository:** https://github.com/kalyani-chinta/TrustVault

### Demo Access for Evaluation

Evaluators can register an account on the live website to explore standard user features, including document management and sharing.

The Activity Log is restricted to Admin users. Separate verified demo Admin credentials may be provided for evaluating administrator-only functionality.

Please use test documents only during evaluation. Do not upload confidential or personal documents.

## Problem Statement

Confidential documents require secure storage, controlled sharing, and accountability. Unrestricted access can expose sensitive information, while missing audit records make it difficult to review document-related activities.

TrustVault aims to address these challenges through authentication, document ownership checks, access control, sharing and revocation workflows, audit logging, and AI-assisted document interaction.

## Objectives

- Provide user registration and login.
- Protect passwords using BCrypt hashing.
- Restrict document access based on ownership and granted permissions.
- Enable document sharing with registered users.
- Allow document owners to revoke previously granted access.
- Record important document activities in audit logs.
- Support document file handling.
- Provide AI-assisted question answering for accessible documents.
- Offer a simple browser-based interface.

## Technology Stack

| Component | Technology |
|---|---|
| Backend | Java, Spring Boot |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL |
| Data Access | Spring Data JPA, Hibernate |
| Authentication | Session-based authentication |
| Password Security | BCrypt |
| Input Validation | Jakarta Bean Validation |
| AI Integration | Google Gemini API |
| JSON Processing | Jackson ObjectMapper |
| Build Tool | Maven |

## Features

### 1. User Authentication

- User registration and login.
- Email validation and duplicate-email checks.
- Password hashing using BCrypt.
- Session-based authentication for application operations.

### 2. Document Management

- Create and retrieve documents.
- Associate documents with their owners.
- Check document ownership and authorized access before serving protected content.
- Display saved document details through the web interface.

### 3. Document Sharing and Access Control

- Share documents with registered users.
- Restrict access according to ownership and granted permissions.
- Revoke previously granted access.
- Check authorization before protected document operations.

### 4. Audit Logging

- Record important document-related activities.
- Track actions such as document creation, opening, sharing, and access revocation.
- Provide audit records for accountability and activity review.
- Restrict the Activity Log interface to Admin users.

### 5. AI-Powered Document Assistant

- Accept questions about document content.
- Integrate with the Google Gemini API to generate answers.
- Check the logged-in user's access to the requested document before processing a question.
- Return generated answers through the application's API and web interface.

**Note:** AI responses depend on API availability, model limits, network connectivity, and valid API configuration. Generated answers should be verified before being relied upon.

### 6. Document File Handling

The application includes document-related storage and file-handling functionality. The complete upload/download lifecycle and its security controls require further validation before production use.

## Security Considerations

- Passwords are hashed rather than stored as plain text.
- Protected operations should enforce authentication and document-level authorization.
- Database credentials and AI API keys should be supplied through environment variables or other secure configuration.
- Uploaded documents and private configuration files should not be committed to the public repository.
- Admin-only operations require appropriate role checks.
- Production use requires further security review, including authorization testing, upload validation, file-size restrictions, error handling, session security, and secure configuration.

TrustVault is a work in progress and should not be considered production-ready without additional security testing.

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

Open a terminal in the project directory containing `pom.xml` and `mvnw.cmd`.

### 2. Create the Database

Create a MySQL database:

```sql
CREATE DATABASE trustvault;
```

Configure a MySQL user with the necessary privileges to access the database.

### 3. Configure Environment Variables

The application uses `DB_PASSWORD` for the database password and `GEMINI_API_KEY` for the AI feature.

In Windows PowerShell, set these variables for the current terminal session:

```powershell
$env:DB_PASSWORD = "your_database_password"
$env:GEMINI_API_KEY = "your_gemini_api_key"
```

Replace the placeholders with your own credentials. Never commit real passwords, database credentials, or API keys to GitHub.

Ensure that `src/main/resources/application.properties` contains the correct database URL and username and reads the password from the `DB_PASSWORD` environment variable.

### 4. Run the Application

Start the application from the project directory:

```powershell
.\mvnw.cmd spring-boot:run
```

Keep the terminal running while using the application. Ensure that MySQL is running and the database configuration is correct.

### 5. Open the Application

Visit:

http://localhost:8080/

This address refers to the local application running on your computer. To access the deployed version, use the Live Demo link above.

## Testing and Validation

Core workflows exercised during development include:

- User registration and login.
- Document creation and retrieval.
- Sharing a document with another registered user.
- Revoking document access.
- Checking audit log records.
- Testing administrator-only Activity Log access.
- Sending an AI question and receiving a generated answer.

Additional validation is required for comprehensive security testing, unauthorized-access edge cases, error handling, and the complete file upload/download lifecycle.

## Project Status

TrustVault has been deployed to a public web address for evaluation. Core document management, sharing, access revocation, audit logging, and AI question-answering workflows have been exercised during development.

The application remains a work in progress. Comprehensive security testing, automated tests, edge-case validation, and further live-environment verification are important next steps.

## Future Enhancements

- Complete and validate secure file upload and download.
- Improve document search and organization.
- Expand audit log reporting and review.
- Strengthen security testing and input validation.
- Improve error handling and user experience.
- Add automated tests for authorization and access revocation.
- Improve monitoring, reliability, and deployment configuration.

## Repository Links

- **GitHub:** https://github.com/kalyani-chinta/TrustVault
- **Live Website:** https://trustvault-bplk.onrender.com/
- ### Demo Login Credentials

**Live Website:** https://trustvault-bplk.onrender.com/

**Admin Email:** kalyani@gmail.com  
**Admin Password:** 12345678

Evaluators can use these credentials to log in and test the Admin-only Activity Log and other available features.

Please use test documents only during evaluation.
