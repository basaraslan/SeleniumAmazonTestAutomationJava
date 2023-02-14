
Feature: Successive Login
    Scenario: User login to the www.amazon.com.tr
    Given User is on homepage
    When Click accept cookies
    When User click login button
    When User click EmailBlank
    And Enter e-mail address
    And User press continue button
    When User click PasswordBlank
    And Enter password
    And Click SignIn button
