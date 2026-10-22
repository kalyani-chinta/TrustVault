## Entry 1 — 22 October 2026: Project Setup

- **Prompt/Task:** Set up the TrustVault Spring Boot project and configure the database.
- **Tool used:** ChatGPT and Spring Boot.
- **What went wrong:** The application initially had database connection and table-related errors.
- **What I did instead:** Checked the database configuration, corrected the setup, and verified that the application could start.
- **Commit link:** To be verified against Git history.

## Entry 2 — 22 October 2026: Password Handling

- **Prompt/Task:** Implement user registration and securely store passwords.
- **Tool used:** ChatGPT.
- **What went wrong:** Registration needed database integration and password hashing.
- **What I did instead:** Implemented BCrypt password hashing and tested registration.
- **Commit link:** To be verified against Git history.

## Entry 3 — 22 October 2026: Login Verification

- **Prompt/Task:** Implement login credential verification.
- **Tool used:** ChatGPT.
- **What went wrong:** Login needed to verify the entered email and password against stored credentials.
- **What I did instead:** Implemented BCrypt-based credential verification. Later, updated the login flow to store the user ID and role in an HTTP session. Document-level authorization still needs implementation and testing.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9

## Entry 4 — 22 October 2026: Role-Based Access Control

- **Prompt/Task:** Plan and implement access control for Administrator, Document Owner, and Viewer roles.
- **Tool used:** ChatGPT.
- **What went wrong:** Returning a role in the login response does not enforce permissions on protected endpoints.
- **What I did instead:** Identified the need for server-side authorization checks. Role-based restrictions for document operations remain to be implemented and tested.
- **Commit link:** Pending implementation.

## Entry 5 — 22 October 2026: Audit Trail

- **Prompt/Task:** Plan an audit trail for document access.
- **Tool used:** ChatGPT.
- **What went wrong:** A successful login does not record who opened a document and when.
- **What I did instead:** Identified the need to record the authenticated user's identity, document accessed, and timestamp. Audit logging remains to be implemented and tested.
- **Commit link:** Pending implementation.

## Entry 6 — 22 October 2026: HTTP Session Management

- **Prompt/Task:** Update the login controller to store the authenticated user's ID and role in an HTTP session, and add a logout endpoint.
- **Tool used:** ChatGPT.
- **What went wrong:** The earlier login flow verified credentials and returned a role but did not retain user information in a session.
- **What I did instead:** Updated `AuthController` to store the user ID and role in the HTTP session after successful credential verification and added a logout endpoint that invalidates the session. Ran `.\mvnw.cmd clean test` and confirmed `BUILD SUCCESS`.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9
- **Remaining limitation:** Protected document endpoints and server-side role authorization still need implementation and testing.
