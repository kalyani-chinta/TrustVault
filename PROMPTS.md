# TrustVault — Development Prompt Log

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

- **Prompt/Task:** Implement login credential verification and session handling.
- **Tool used:** ChatGPT.
- **What went wrong:** Login needed to verify entered credentials and retain the authenticated user's identity.
- **What I did instead:** Implemented BCrypt-based credential verification, stored the user ID and role in the HTTP session after successful login, and added logout functionality.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9

## Entry 4 — 22 October 2026: Role-Based Access Control

- **Prompt/Task:** Plan and implement access control for administrators and document owners.
- **Tool used:** ChatGPT.
- **What went wrong:** Returning a role in the login response alone does not enforce permissions.
- **What I did instead:** Added session-based ownership checks for document operations and an administrator-only audit log endpoint that checks the user's session role.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/c75ed8d
- **Remaining limitation:** Authorization uses controller-level checks. Full authorization through Spring Security and broader role-based access testing remain future work.

## Entry 5 — 22 October 2026: Document Management and Audit Trail

- **Prompt/Task:** Implement document creation, retrieval, ownership checks, and audit logging.
- **Tool used:** ChatGPT.
- **What went wrong:** Login alone did not provide document ownership enforcement or a record of document activity.
- **What I did instead:** Added document creation and retrieval endpoints for authenticated users, checked ownership when opening a document, and recorded document creation and opening activities with user and document IDs and timestamps.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/19144de
- **Testing:** Ran `.\mvnw.cmd clean test` and confirmed `BUILD SUCCESS` after the document and audit endpoint implementation.

## Entry 6 — 22 October 2026: HTTP Session Management

- **Prompt/Task:** Store the authenticated user's ID and role in an HTTP session and provide logout.
- **Tool used:** ChatGPT.
- **What went wrong:** The earlier login flow did not retain user information in a session.
- **What I did instead:** Updated `AuthController` to set session attributes after successful credential verification and invalidate the session during logout.
- **Commit link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9

## Entry 7 — 23 October 2026: Document Management Interface

- **Prompt/Task:** Create a browser interface for creating and viewing documents.
- **Tool used:** ChatGPT.
- **What went wrong:** The document management page was initially unavailable at its URL.
- **What I did instead:** Added `documents.html` under the static resources directory and restarted the Spring Boot application so the new resource could be served.
- **Commit link:** To be verified against Git history.

## Entry 8 — 23 October 2026: Project Documentation

- **Prompt/Task:** Update the README to describe the implemented features and remaining work accurately.
- **Tool used:** ChatGPT.
- **What I did instead:** Updated the project overview, technology stack, implemented features, and current project status.
- **Commit link:** To be verified against Git history.

## Remaining Work

- Test registration, login, logout, document creation, and document retrieval end to end.
- Improve login navigation and user feedback.
- Test unauthorized and cross-user document access.
- Verify administrator-only audit log access.
- Review and update project documentation against the final Git history.
- Deploy the application and test the deployed version before submission.