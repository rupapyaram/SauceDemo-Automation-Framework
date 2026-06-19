# SauceDemo Login Automation Framework

## 📌 Project Overview

This project automates the **Login functionality of SauceDemo application** using Selenium WebDriver with Java, TestNG, Maven, and Page Object Model (POM) design pattern.

It is built as a QA Automation learning and portfolio project to demonstrate automation testing skills.

---

## Test Scenarios Covered

1. Valid Login Test
2. Invalid Login Test
3. Locked User Login Test

---

## Framework Design

The framework follows **Page Object Model (POM)** approach:

* **pages package** → Contains UI locators and reusable methods
* **tests package** → Contains TestNG test cases

This helps in better code reusability and maintainability.

---

## Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* Eclipse IDE

---

## Project Structure

```
src
 └── test
      └── java
           ├── pages
           │     └── LoginPage.java
           └── tests
                 └── LoginTest.java

pom.xml
README.md
```

---

## How to Run the Project

1. Clone the repository
2. Import project into Eclipse as Maven Project
3. Run `pom.xml` to download dependencies
4. Run `LoginTest.java` as TestNG Test

---

## Framework Features

* Page Object Model (POM)
* TestNG annotations (@Test, @BeforeMethod, @AfterMethod)
* Maven dependency management
* Reusable login method
* Assertion-based validation

---

## 🎯 Purpose of Project

This project was created to:

* Learn Selenium Automation Testing
* Understand TestNG framework
* Practice POM design pattern
* Build QA Automation portfolio for job applications
