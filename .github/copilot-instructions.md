# Copilot Project Instructions

This document provides the essential rules and best practices for AI agents and developers working on this repository. It replaces all previous rules files (including rules.md) and must be followed for all future contributions.

## 1. Project Structure & File Organization
- Follow the directory and module organization as defined in `.github/agent/structure.mdc`.
- Place new files in the correct directories and maintain organizational conventions.

## 2. Coding Standards
- **Java First:** All new code must be written in Java. Follow the project's Java coding standards as defined in `.github/agent/coding-standards.mdc`.
- **Styling:** Make sure that no front-end code is present in the project as defined in `.github/agent/styling-guide.mdc`. 
- **API Interaction:** Use the project's API interaction guidelines for fetching data, error handling, and state management as defined in `.github/agent/api-interaction.mdc`.
- **Error Handling:** Implement robust error handling and display user-friendly messages.
- **Security:** Be mindful of web security vulnerabilities.
- **Circular Dependencies:** Avoid circular dependencies in your code. If you encounter them, refactor to eliminate them. Follow the guidelines in `.github/agent/circular-dependencies.mdc`.

## 3. Review & Completion
- **Testing:** Think through user flows and edge cases. Describe manual and automated tests as appropriate. Follow the rules defined in `.github/agent/testing-guidelines.mdc`.
- **Self-Review:** Double-check that your solution addresses all requirements and follows all guidelines.
- **Linting & Formatting:** Ensure your code is clean, readable, and consistent.
- **Performance:** Review for potential bottlenecks and optimize as needed.
- **Documentation:** Comment complex logic and document public APIs/components.
- **Clean Up:** Remove dead code, debugging statements, and ensure TODOs are actionable.

## 4. Follow-up
- Suggest further improvements or follow-up tasks if needed.

---

For detailed standards, see `.github/agent/main-rules` and related `.mdc` files.