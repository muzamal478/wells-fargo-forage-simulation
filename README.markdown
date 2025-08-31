# Wells Fargo Forage Software Engineering Job Simulation

Welcome to my repository for the Wells Fargo Software Engineering Job Simulation on Forage! This project completes both **Task 1 (Entity Relationship Diagram - ERD)** and **Task 2 (JPA Data Model Implementation)**, simulating real-world software engineering tasks for managing financial advisors' client portfolios at Wells Fargo. The repository demonstrates my skills in data modeling, Java, JPA, Spring Boot, and system design, built to professional standards.

## Project Overview

This repository contains:
- **Task 1**: A comprehensive ERD designed using Mermaid to model the data structure for an investment management system, including entities like FinancialAdvisor, Client, Portfolio, Account, Security, Holding, and Transaction.
- **Task 2**: A fully implemented data model in a Spring Boot application using Java Persistence API (JPA), with entity classes, annotations, relationships, constructors, and getters/setters.

The project is a hands-on demonstration of my ability to design and implement scalable, normalized data systems for financial applications, aligning with Wells Fargo's requirements for their 2026 Technology Summer Internship.

## Repository Structure

```
wells-fargo-forage-simulation/
├── pom.xml                          # Maven configuration with Spring Boot and JPA dependencies
├── src/
│   ├── main/
│   │   ├── java/com/wellsfargo/
│   │   │   ├── WellsFargoApplication.java  # Main Spring Boot application
│   │   │   └── entities/
│   │   │       ├── FinancialAdvisor.java   # Entity for financial advisors
│   │   │       ├── Client.java             # Entity for clients
│   │   │       ├── Portfolio.java          # Entity for portfolios
│   │   │       ├── Account.java            # Entity for accounts
│   │   │       ├── Security.java           # Entity for securities
│   │   │       ├── Holding.java            # Entity for holdings
│   │   │       └── Transaction.java        # Entity for transactions
│   │   └── resources/
│   │       └── application.properties      # H2 database configuration
│   └── test/                              # Test files (unchanged)
├── task1/
│   ├── ERD.mmd                            # Mermaid source code for ERD
│   └── ERD.png                            # Rendered ERD diagram
├── README.md                              # This file
└── .gitignore                             # Git ignore file
```

## Task 1: Entity Relationship Diagram (ERD)

### Objective
Designed a data model for a new investment management system to help financial advisors manage client portfolios efficiently.

### Details
- **Tool Used**: Mermaid with "crow's foot" notation for professional visualization.
- **Entities Modeled**:
  - **FinancialAdvisor**: Manages multiple portfolios (advisor_id PK, first_name, last_name, email, phone, employment_date).
  - **Client**: Owns multiple portfolios (client_id PK, first_name, last_name, email, phone, date_of_birth, risk_tolerance).
  - **Portfolio**: Links advisors and clients to accounts (portfolio_id PK, client_id FK, advisor_id FK, name, creation_date).
  - **Account**: Contains holdings and transactions (account_id PK, portfolio_id FK, type, account_number, current_balance).
  - **Security**: Represents investment assets (security_id PK, ticker_symbol, name, category, expense_ratio).
  - **Holding**: Junction table for accounts and securities (holding_id PK, account_id FK, security_id FK, quantity, purchase_price, purchase_date).
  - **Transaction**: Logs trades (transaction_id PK, account_id FK, security_id FK, type, quantity, price, timestamp).
- **Design Choices**:
  - Normalized to 3rd Normal Form (3NF) to minimize redundancy and ensure data integrity.
  - Used Holding as a junction table to resolve many-to-many relationships between Account and Security.
  - Included Transaction table for audit trails, critical for financial compliance.
  - Matches requirements: advisors manage clients/portfolios, portfolios contain securities via accounts/holdings, securities include name/category/purchase details.
- **Files**:
  - `task1/ERD.mmd`: Mermaid source code for the ERD.
  - `task1/ERD.png`: Rendered diagram (generated via https://mermaid.live/).

## Task 2: JPA Data Model Implementation

### Objective
Implemented the ERD as a data model in a Spring Boot application using JPA, enabling persistence to a relational database.

### Details
- **Technologies**: Java, Spring Boot, JPA (Java Persistence API), H2 in-memory database.
- **Implementation**:
  - Created seven entity classes in `src/main/java/com/wellsfargo/entities/`.
  - Each entity uses `@Entity`, `@Id` with `@GeneratedValue` for auto-generated IDs, and appropriate annotations (`@Column`, `@OneToMany`, `@ManyToOne`).
  - Defined bidirectional relationships (e.g., FinancialAdvisor to Portfolio, Portfolio to Account) with `cascade = CascadeType.ALL` where logical.
  - Included constructors initializing all instance variables (except ID/lists) and getters/setters (no ID setter).
  - Configured H2 database in `application.properties` for testing.
- **Files**:
  - `FinancialAdvisor.java`, `Client.java`, `Portfolio.java`, `Account.java`, `Security.java`, `Holding.java`, `Transaction.java`.
  - `application.properties`: Configures H2 database (`spring.jpa.hibernate.ddl-auto=update`).

## How to Run

1. **Prerequisites**:
   - Install IntelliJ IDEA (Community Edition): https://www.jetbrains.com/idea/
   - Install Git: https://git-scm.com/
   - Java 17+ (configured in pom.xml).

2. **Steps**:
   - Clone the repository: `git clone https://github.com/muzamal478/wells-fargo-forage-simulation.git`
   - Open in IntelliJ: File > Open > Select the project folder.
   - Build the project: Build > Build Project (downloads Maven dependencies).
   - Run `WellsFargoApplication.java` to start the Spring Boot app.
   - Access H2 console (if enabled) at `http://localhost:8080/h2-console` to verify database schema.

3. **View ERD**:
   - Open `task1/ERD.png` for the visual diagram.
   - Or, paste `task1/ERD.mmd` into https://mermaid.live/ to render interactively.

## Learnings and Skills Gained

- **Data Modeling**: Designed a normalized ERD for a financial system, ensuring scalability and compliance.
- **Entity Relationship Diagramming**: Mastered Mermaid for professional visualization of database structures.
- **Java and JPA**: Implemented complex entity relationships using JPA annotations and Spring Boot.
- **System Design**: Learned to translate requirements into structured data models.
- **Spring Framework**: Gained hands-on experience with Spring Boot for backend development.
- **Git and GitHub**: Managed version control and repository organization.

## Why This Matters

This project simulates real-world software engineering tasks at Wells Fargo, preparing me for roles like the 2026 Technology Summer Internship. It showcases my ability to:
- Analyze requirements and design robust data models.
- Implement backend systems using industry-standard tools (Java, Spring, JPA).
- Document and present work professionally for career growth.

## About Me

Completed by Muzamil on August 31, 2025. Connect with me on LinkedIn: [Insert Your LinkedIn URL] to discuss tech, internships, or Forage experiences!

---

*This repository is part of the Forage Wells Fargo Job Simulation, forked from the Task 2 starter repo and enhanced with Task 1 deliverables. All code and diagrams are my original work, adhering to Forage guidelines.*