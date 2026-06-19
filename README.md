# Selenium Automation Framework (Java + TestNG + POM)

## Overview
This is a Selenium WebDriver automation framework built using Java, TestNG, Maven, and Page Object Model (POM) design pattern.

It automates login functionality of the SauceDemo application and demonstrates a scalable automation framework with reporting, utilities, and configuration management.

---

## Tech Stack
Java, Selenium WebDriver, TestNG, Maven, POM, Extent Reports

---

## Framework Structure
src/test/java  
- base (BaseTest - browser setup & teardown)  
- pages (Page Object classes)  
- tests (TestNG test cases)  
- listeners (TestNG listeners for reporting & screenshots)  
- utils (ConfigReader, Screenshot utility)

src/test/resources  
- config.properties (test data & environment config)

---

## Features
- Page Object Model (POM)
- BaseTest for WebDriver management
- Config-driven test data
- TestNG Listener integration
- Screenshot capture on failure
- Extent HTML reporting
- Reusable utilities

---

## Test Scenarios
- Valid login test  
- Invalid login test  
- Locked user login test  

---

## Reports
Extent Report generated at:
test-output/ExtentReport.html

Includes:
- Pass / Fail / Skip status
- Execution summary
- Screenshots for failed tests

---

## Screenshots
Saved at:
/screenshots

---

## Configuration
config.properties contains:

url=https://www.saucedemo.com/  
valid_username=standard_user  
valid_password=secret_sauce  
invalid_username=wrong_user  
invalid_password=wrong_password  
locked_username=locked_out_user  
locked_password=secret_sauce  

---

## How to Run
1. Clone repo
2. Import as Maven project in Eclipse/IntelliJ
3. Run LoginTest or testng.xml

---

## Author
Rupa Pyaram

---

## Notes
This framework demonstrates real-world automation concepts like POM, configuration management, reporting, and reusable design.
