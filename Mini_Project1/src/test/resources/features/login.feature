Feature: As a user I want login to altashop

Scenario: login to altashop account
  Given I open alta-shop.vercel.app
  When I click login field
  And I on the login page
  And I input valid email
  And I input valid password
  And I click login button
  Then I succsessfully login

  Scenario: login without email account
    Given I open alta-shop.vercel.app
    When I click login field
    And I on the login page
    And I input valid email
    And I click login button
    Then I can't login to altasop account

    Scenario: login without password account
      Given I open alta-shop.vercel.app
      When I click login field
      And I on the login page
      And I input valid password
      And I click login button
      Then I can't login to altasop account

      Scenario: login with inccorrect accoount
        Given I open alta-shop.vercel.app
        When I click login field
        And I on the login page
        And I input invalid email
        And I input invalid password
        And I click login button
        Then I can't login to altasop account

        Scenario: login without input account
          Given I open alta-shop.vercel.app
          When I click login field
          And I on the login page
          And I click login button
          And I can't login to altasop account