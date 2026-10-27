# TC02_Login – Selenium Login Automation Test

## Overview
This Java Selenium WebDriver test automates a **valid-user login** to the Cloudberry Store demo website. It checks whether the user reaches the **My Account** page after signing in and prints a pass/fail message to the console.

## Technologies Used
- Java
- Selenium WebDriver
- Google Chrome / ChromeDriver
- XPath locators

## Test Scenario
**Test Case ID:** `TC02_Login`  
**Test Type:** Functional / Positive Login Test  
**Application Under Test:** https://cloudberrystore.services/

### Test Steps
1. Launch Google Chrome.
2. Navigate to the Cloudberry Store website and maximize the browser window.
3. Click the **My Account** dropdown.
4. Select **Login**.
5. Enter a valid email address and password.
6. Click the **Login** button.
7. Verify that the **My Account** heading is displayed.
8. Close the browser.

## Expected Result
After submitting valid credentials, the user should be logged in and the **My Account** heading should be visible.

## How the Test Works
- Creates a `ChromeDriver` instance.
- Sets an implicit wait of **30 seconds** for element lookup.
- Uses XPath expressions to locate and interact with the account menu, login link, form fields, login button, and account heading.
- Waits **5 seconds** after submitting the login form.
- Uses `isDisplayed()` to confirm the **My Account** heading is visible.
- Prints `Test Passed` when the heading is displayed or `Test Failed` otherwise.
- Calls `driver.quit()` to close the browser.

## Prerequisites
- Java JDK installed
- Selenium Java dependencies configured in your project
- Google Chrome installed
- Compatible ChromeDriver available through Selenium Manager or your driver configuration
- A valid test account for the website

## How to Run
1. Open the Java project in your IDE (such as Eclipse).
2. Configure Selenium WebDriver dependencies.
3. Open `TC02_Login.java` in the `day6` package.
4. Provide valid **test account** credentials in a secure way before running.
5. Run the class as a **Java Application**.
6. Check the console for the test result.

## Example Console Output
Successful login:

```text
Test Passed
```

The script intends to print `Test Failed` if the heading is not displayed, but an element-not-found exception can stop execution first if the heading does not exist. This test does not currently use a testing framework or assertions.

## Improvements to Consider
- **Remove hard-coded credentials** from the Java file and load them from environment variables or another secure configuration source. If real credentials were committed or shared, change that password.
- Replace `Thread.sleep(5000)` with an explicit wait (`WebDriverWait`) for the expected element.
- Use JUnit or TestNG assertions and reporting instead of only console output.
- Wrap browser cleanup in a `finally` block so Chrome closes even if the test fails with an exception.
- Add negative login tests for incorrect credentials and missing input values.

## Project Structure
```text
day6/
└── TC02_Login.java
```

## Learning Objective
Practice Selenium WebDriver browser navigation, XPath element locators, entering text with `sendKeys()`, clicking elements, simple UI validation, and browser cleanup.
