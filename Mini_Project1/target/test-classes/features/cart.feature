Feature: As user I want to edit my cart

  Scenario: I want to increase my item shop
    Given I open and login altahsop account
    When I go to cart button
    And I on the cart page
    And I click pluss button to increase quantity my item
    Then I succsessfully increase my item

  Scenario: I want to decrease my item shop
    Given I open and login altahsop account
    When I go to cart button
    And I on the cart page
    And I click mines button to decrease quantity my item
    Then I succsessfully decrease my item