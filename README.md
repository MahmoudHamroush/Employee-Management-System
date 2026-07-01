# Employee Management System

A production-ready REST API for managing employees and departments, built with **Java 21**, **Spring Boot 3**, **Spring Data JPA**, **MySQL**, and **Flyway**. The system handles CRUD operations, relational mapping, and database migrations with validation out of the box.

---

## 🚀 Features

- ✅ **Full CRUD** for Employees and Departments  
- 🔗 **Many‑to‑One Relationship** – each employee belongs to a department  
- 🗄️ **Flyway Migrations** – version‑controlled schema (see `V1__init_employee_table.sql`)  
- 🛡️ **Validation** – uses Hibernate Validator to enforce constraints (e.g., `@NotBlank`, `@Email`, `@DecimalMin`)  
- 🧹 **Lombok** – eliminates boilerplate code (`@Data`, constructors, etc.)  
- 🐘 **MySQL** – production‑ready relational database  
- 📦 **Maven** – dependency management and build automation  

---

## 🛠️ Tech Stack

| Component        | Technology                          |
|------------------|-------------------------------------|
| Language         | Java 21                             |
| Framework        | Spring Boot 3.1.0 (or 4.1.0-SNAPSHOT) |
| Data Access      | Spring Data JPA / Hibernate         |
| Database         | MySQL 8+                            |
| Migration Tool   | Flyway (with `flyway-mysql`)        |
| Validation       | Jakarta Validation (`spring-boot-starter-validation`) |
| REST API         | Spring Web MVC                      |
| Utility          | Lombok                              |
| Build Tool       | Maven                               |

---

## 📦 Getting Started

### Prerequisites

- **Java 21** (or later)  
- **MySQL 8+** (running locally)  
- **Maven 3.8+**  
- Your favorite IDE (IntelliJ, Eclipse, VS Code)

### 1. Clone the repository

```bash
git clone https://github.com/MahmoudHamroush/Employee-Management-System.git
cd Employee-Management-System
