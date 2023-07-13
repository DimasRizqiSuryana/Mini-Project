Feature: I want to choose a product
  Scenario: I want to choose a product
    Given I succsessfully login alta-shop.vercel.app account
    When I click detail button to see detail product
    And I click Altashop field to back home page to buy product
    And I click buying button at aitem
    Then I succsessfully add item