# TrustVault — Development Prompt Log

## Project Overview

TrustVault is a web-based document management application developed using Java, Spring Boot, HTML, CSS, JavaScript, and MySQL. The project focuses on user authentication, document ownership, controlled document sharing, access revocation, and audit logging.

This document records the development tasks, use of AI assistance, problems encountered, solutions implemented, and remaining work during development.

## Entry 1 — 22 October 2026: Project Setup

- **Prompt/Task:** Set up the TrustVault Spring Boot project and configure the database.
- **Tool Used:** ChatGPT and Spring Boot.
- **What Went Wrong:** The application initially encountered database connection and table-related errors.
- **What I Did:** Checked the database configuration, corrected the setup, and verified that the application could start.
- **Commit Link:** To be verified against Git history.

## Entry 2 — 22 October 2026: Password Handling

- **Prompt/Task:** Implement user registration and securely store passwords.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** Registration required database integration, input validation, and password hashing.
- **What I Did:** Implemented BCrypt password hashing and tested the registration workflow.
- **Commit Link:** To be verified against Git history.

## Entry 3 — 22 October 2026: Login Verification

- **Prompt/Task:** Implement login credential verification and session handling.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** Login needed to verify entered credentials and retain the authenticated user's identity.
- **What I Did:** Implemented BCrypt-based credential verification, stored the user ID and role in the HTTP session after successful login, and added logout functionality.
- **Commit Link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9

## Entry 4 — 22 October 2026: Role-Based Access Control

- **Prompt/Task:** Implement access control for administrators and document owners.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** Returning a role in the login response alone does not enforce permissions.
- **What I Did:** Added session-based ownership checks for document operations and an administrator-only audit log endpoint that checks the user's session role.
- **Commit Link:** https://github.com/kalyani-chinta/TrustVault/commit/c75ed8d
- **Remaining Limitation:** Authorization uses controller-level checks. Further security testing and review of the authorization implementation remain necessary.

## Entry 5 — 22 October 2026: Document Management and Audit Trail

- **Prompt/Task:** Implement document creation, retrieval, ownership checks, and audit logging.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** Authentication alone did not enforce document ownership or provide a record of document activity.
- **What I Did:** Added document creation and retrieval endpoints for authenticated users, checked ownership when opening a document, and recorded document creation and opening activities with user IDs, document IDs, and timestamps.
- **Commit Link:** https://github.com/kalyani-chinta/TrustVault/commit/19144de
- **Testing:** The Maven build and tests were reported as successful after the document and audit endpoint implementation.

## Entry 6 — 22 October 2026: HTTP Session Management

- **Prompt/Task:** Store the authenticated user's ID and role in an HTTP session and provide logout functionality.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** The login flow needed to retain user information between authenticated requests.
- **What I Did:** Updated the authentication controller to set session attributes after successful credential verification and invalidate the session during logout.
- **Commit Link:** https://github.com/kalyani-chinta/TrustVault/commit/49ce2c9

## Entry 7 — 23 October 2026: Document Management Interface

- **Prompt/Task:** Create a browser interface for creating and viewing documents.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** The document management page was initially unavailable at its URL.
- **What I Did:** Added the document management HTML page under the static resources directory and restarted the Spring Boot application to serve the updated resource.
- **Commit Link:** To be verified against Git history.

## Entry 8 — 23 October 2026: Project Documentation

- **Prompt/Task:** Document the project setup, technology stack, implemented features, and remaining work.
- **Tool Used:** ChatGPT.
- **What I Did:** Prepared the README with project information, prerequisites, database configuration, application startup instructions, tested workflows, and future enhancements.
- **Commit Link:** To be verified against Git history.

## Entry 9 — 24 October 2026: Document Sharing

- **Prompt/Task:** Implement document sharing with another registered user using their email address.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** Sharing needed to identify the recipient account and associate that user with the selected document.
- **What I Did:** Implemented the sharing workflow to find the registered recipient, create a sharing record, and record the sharing activity in the audit log.
- **Testing:** Tested sharing a document with a second registered account and checked the result.
- **Commit Link:** To be verified against Git history.

## Entry 10 — 24 October 2026: Revoke Document Access

- **Prompt/Task:** Implement a way for a document owner to revoke access previously granted to another user.
- **Tool Used:** ChatGPT.
- **What Went Wrong:** The revoke workflow needed to identify the existing sharing record and remove the correct user's access.
- **What I Did:** Updated the revoke workflow to check the sharing record, delete the selected access record, and record the revocation event.
- **Testing:** Tested access revocation and verified that the recipient's account no longer displayed the revoked document.
- **Commit Link:** To be verified against Git history.

## Entry 11 — 24 October 2026: Audit Log Verification

- **Prompt/Task:** Verify whether important document activities were recorded in the audit log.
- **Tool Used:** ChatGPT and a web browser.
- **What I Did:** Opened the audit log API endpoint and checked the returned records.
- **Testing:** Observed records for document creation, sharing, opening, and access revocation.
- **Remaining Limitation:** Further authorization testing is needed to ensure that unauthorized users cannot access audit logs or other protected information.
- **Commit Link:** To be verified against Git history.

## Testing Summary

The following workflows were tested locally during development:

- User registration and login.
- Document creation and retrieval by the owner.
- Sharing a document with another registered user.
- Revoking previously granted document access.
- Checking that the recipient no longer sees the revoked document.
- Verifying audit log records for document-related activities.

These checks demonstrate local functionality for the tested workflows. They do not replace comprehensive security testing or production validation.

## Remaining Work

- Complete end-to-end testing of registration, login, logout, and document management.
- Test document access restrictions using multiple user accounts, including unauthorized access attempts.
- Verify administrator and viewer permissions, particularly audit log authorization.
- Review session handling, server-side authorization, and input validation.
- Add or verify automated tests for authentication, document ownership, sharing, revocation, and audit log access.
- Confirm that README setup instructions work on a clean environment.
- Verify the GitHub repository, commit history, and project documentation.
- Deploy the application and test the live URL, database connectivity, and core workflows.
- Complete the Snovasys project submission and verify all required fields before the deadline.

## Responsible AI Usage

ChatGPT was used as a development assistant for implementation guidance, troubleshooting, code explanations, and documentation preparation. The application was tested locally for the workflows described above. Commit links and development history should be verified against the actual Git repository before final submission.

## Repository

[TrustVault on GitHub](https://github.com/kalyani-chinta/TrustVault)
