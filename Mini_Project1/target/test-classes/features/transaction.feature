Feature: I want to see transaction
  Scenario: I want to see my transaction with login account
    Given I open and login altahsop account
    When I click user button
    And I click transaction button
    Then I on the transaction page
