# TrustVault

## Secure Document Management System

TrustVault is a web-based application designed to manage documents with user authentication, ownership-based access, and audit logging.

## Problem Statement

Sensitive documents require controlled access and accountability. TrustVault provides a centralized platform for users to create, view, and manage their documents while recording relevant access activities.

## Objectives

- Provide user registration and login.
- Store user passwords securely using BCrypt hashing.
- Support document ownership and access restrictions.
- Record document creation and opening activities.
- Provide administrators with access to audit logs.

## Technology Stack

- **Backend:** Java, Spring Boot
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **Authentication:** Session-based login
- **Password Security:** BCrypt
- **Build Tool:** Maven

## Implemented Features

- User registration with email validation and duplicate-email checks.
- Password hashing and login credential verification.
- Default Viewer role for new users.
- Session handling for authenticated users.
- Document creation and retrieval for the logged-in owner.
- Ownership checks when opening documents.
- Audit logging for document creation and opening.
- Administrator-only audit log endpoint.
- HTML pages for registration, login, and document management.

## Project Status

TrustVault is a work in progress. Additional testing, user-interface improvements, deployment, and final validation remain to be completed.

## Repository

[TrustVault on GitHub](https://github.com/kalyani-chinta/TrustVault)