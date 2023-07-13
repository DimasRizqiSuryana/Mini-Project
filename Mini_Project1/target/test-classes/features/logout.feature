Feature: As user I want  to logout my account

  Scenario: I want to logout my account
    Given I open altahsop with login condition
    When I click user button
    And I click Logout button
    Then I succsessfully logout
