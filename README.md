This project demonstrates automated testing of MakeMyTrip(MMT) website to Search for the Cheapest flight using Selenium WebDriver with a Page Object Model (POM)
framework. TestNG is used for test execution and Maven for project management and dependency handling.
---

# Selenium POM Framework with Page Factory

## Overview

This project demonstrates a Selenium automation framework based on the Page Object Model (POM) design pattern with Page Factory annotation. 
The POM design pattern separates the test code from the web elements, making the code more readable, maintainable, and reusable.
Use Property file to read the data & Data provider to run with multiple set of data
Extent report & ReportNG report are used for reporting.

## Project Structure

The project structure is organized as follows:

- **src/main/java:** Contains the page classes representing web pages and the base classes for setting up the WebDriver.
  - **pages:** Contains individual page classes, each representing a web page or a component.
  - **utilities:** Contains utility classes for WebDriver setup, configuration, and other common functionalities.
- **src/test/java:** Holds test classes that utilize the page classes to perform tests.
  - **tests:** Contains test classes responsible for test scenarios.

## Prerequisites

To run the tests from this project, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven
- WebDriver (e.g., ChromeDriver, GeckoDriver, etc.)

## Setup

1. Clone this repository to your local machine.
2. Ensure you have the necessary WebDriver executable for your browser and update the WebDriver path/configuration 
in the `DriverFactory` class.
3. Open the project in your preferred IDE.
4. Configure the test suite or individual test classes as needed.

## Running Tests

You can run the tests either individually or as a suite using TestNG.xml file or Maven commands:

- To run all tests from TestNG: Simply right click on TestNG.xml file & select RunAs > the TestNG Suite.
- To run all tests: `mvn test`

## Writing Tests

When writing new tests or modifying existing ones:

- Utilize the page classes from `src/main/java/pages`.
- Follow the POM pattern by keeping test logic separate from the web elements and interactions.
- Ensure clear and concise naming conventions for methods and variables in the page classes for better readability.

## Contributors

- Viral Dudhat
