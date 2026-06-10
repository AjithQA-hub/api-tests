# API Automation Project - Rest Assured + TestNG

## 1. Application Chosen : [https://finance-app-demo.com](https://demo.firefly-iii.org/login)

## 2. Framework and Language Used

- **Language:** Java
- **Automation Tool:** Rest Assured
- **Testing Framework:** TestNG
- **Build Tool:** Maven

## 3. Add Dependencies in pom.xml and Install Plugin

- **TestNG plugin in Eclipse**
- **Add the Rest Assured dependency version 4.3.3**
- **Add the TestNG dependency version 6.14.3**

## 4. How to run the tests (setup steps)

-- **Open the test class (e.g., `RestassuredApi1.java`)**
-- **Right-click on the file**
-- **Select **Run As → TestNG Test**

## Assumptions and Limitations

- The API used (https://jsonplaceholder.typicode.com) is always available and stable.
- No authentication or token is required to access the endpoints.
- No validation of backend database is possible since data is not persisted.
