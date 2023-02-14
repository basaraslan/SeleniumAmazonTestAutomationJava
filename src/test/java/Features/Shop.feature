
Feature: To be able to shop through the website in e-commerce platform, Amazon after successive Login and finding the product.
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

  #belongs to find product
    When Click the search button
    When Write product name
    When Click search button
    When Filter for Shipped by Amazon
    When Filter for Apple
  #belongs to find product

  Scenario: User adds and deletes product to cart
    When Click the first product
    When Add to Cart
      And Close the Cart
      And Click the Cart
    When Check at cart page
    When Delete the product

