Feature: As user I want to register for Altashop account

  Scenario: I want register Altashop account
    Given I open alta-shop.vercel.app
    When I click login field
    And I click register field
    And I on the register page
    And I input new username
    And I input new email
    And I input new password
    And I click register button
    Then I should be redirected to login page

  Scenario: I register Altashop account without input username
    Given I open alta-shop.vercel.app
    When I click login field
    And I click register field
    And I on the register page
    And I input new email
    And I input new password
    And I click register button
    Then I can't regist account

  Scenario: I register Altashop account without input email
    Given I open alta-shop.vercel.app
    When I click login field
    And I click register field
    And I on the register page
    And I input new username
    And I input new password
    And I click register button
    Then I can't regist account

  Scenario: I register Altashop account without input password
    Given I open alta-shop.vercel.app
    When I click login field
    And I click register field
    And I on the register page
    And I input new username
    And I input new email
    And I click register button
    Then I can't regist account

  Scenario: I want register Altashop account
    Given I open alta-shop.vercel.app
    When I click login field
    And I click register field
    And I on the register page
    And I input new username1
    And I input exist email
    And I input new password1
    And I click register button
    Then I can't regist account
