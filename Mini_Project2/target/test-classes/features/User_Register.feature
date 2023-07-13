Feature: Posts

  As an admin
  I want to see the posts
  So that I can request to the api endpoints

  Scenario: POST - As an admin I have be able to create new user account
    Given I set POST Register api endpoints
    When I send POST Register HTTP request
    Then I receive valid HTTP response code 201

  Scenario: POST - As an admin I shouldn't be able to create new user account posts with invalid url
    Given I set typo POST register api endpoints
    When I send typo POST HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page