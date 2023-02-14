Feature: To be able to search and find the product, after the successive login
  Background:
    #belongs to login
    Given User is on homepage
    When Click accept cookies
    When User click login button
    When User click EmailBlank
    And Enter e-mail address
    And User press continue button
    When User click PasswordBlank
    And Enter password
    And Click SignIn button
    #belongs to login

  Scenario: User finds the product from the website
    When Click the search button
    When Write product name
    When Click search button
    When Filter for Shipped by Amazon
    When Filter for Apple