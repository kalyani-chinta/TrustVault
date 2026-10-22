## Entry 1 — 22 October 2026: Project Setup
- Prompt/Task:Set up the TrustVault Spring Boot project and configure the database.
- Tool used:ChatGPT and Spring Boot.
- What went wrong:The application initially had database connection and table-related errors.
- What I did instead:Checked the database configuration, corrected the setup, and verified that the application could start.
- Commit link:To be added after committing this work.

## Entry 2 — 22 October 2026: Password Handling
- Prompt/Task:Implement user registration and securely store passwords.
- Tool used:ChatGPT.
- What went wrong:Registration needed database integration and password hashing.
- What I did instead:Implemented password hashing with BCrypt and tested registration.
- Commit link:To be added after committing this work.

## Entry 3 — 22 October 2026: Login Verification
- Prompt/Task:Implement login credential verification.
- Tool used:ChatGPT.
- What went wrong:The login flow needed to verify the entered email and password against stored credentials.
- What I did instead:Added credential verification using BCrypt and tested the login response. A complete authenticated session still needs implementation.
- Commit link:To be added after committing this work.

## Entry 4 — 22 October 2026: Role-Based Access Control
- Prompt/Task:Plan access control for Administrator, Document Owner, and Viewer roles.
- Tool used:ChatGPT.
- What went wrong:Login credential verification alone does not enforce permissions for each role.
- What I did instead:Identified role-based authorization as a required implementation and testing task.
- Commit link:To be added after committing this work.

## Entry 5 — 22 October 2026: Audit Trail
- Prompt/Task:Plan an audit trail for document access.
- Tool used: ChatGPT.
- What went wrong:A login response alone does not record who opened a document and when.
- What I did instead:Identified document-access logging with user identity and timestamps as a required implementation and testing task.
- Commit link:To be added after committing this work.
