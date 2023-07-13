Feature: Login, As a user I want to login,So that i can access homepage

  Scenario: As a user i want to login form my account
    Given I am on the product list
    When I click button sign in
    And I input correct email in login
    And I input correct password in login
    And I click button login
    Then I get result the message

  Scenario: As a user i want to login with wrong password

    Given I am on the product list
    When I click button sign in
    And I input correct email in login
    And I input incorrect password in login
    And I click button login
    Then I get result the error message

  Scenario: As a user i want to login with wrong email

    Given I am on the product list
    When I click button sign in
    And I input incorrect email in login
    And I input correct password in login
    And I click button login
    Then I get result the error message

  Scenario: As a user i want to login with invalid email

    Given I am on the product list
    When I click button sign in
    And I input invalid email in login
    And I input correct password in login
    And I click button login
    Then I get result the error message

  Scenario: As a user i want to login without input password

    Given I am on the product list
    When I click button sign in
    And I input correct email in login
    And I input empty password in login
    And I click button login
    Then I get result the empty message