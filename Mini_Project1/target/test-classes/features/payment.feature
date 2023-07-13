Feature: As user I want to pay my item

  Scenario: I want to pay my item
    Given I open and login altahsop account
    When I go to cart button
    And I on the cart page
    And I click pay button
    Then I succsessfully pay my item