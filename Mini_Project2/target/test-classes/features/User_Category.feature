Feature: Posts

  As an admin
  I want to see the posts
  So that I can request to the api endpoints

Scenario: POST - As an admin I have be able to create new category posts
Given I set POST category api endpoints
When I send POST category HTTP request
Then I receive valid HTTP response code 201
And I receive valid data for new category posts

Scenario: POST - As an admin I shouldn't be able to create new category posts with invalid url
Given I set typo POST category api endpoints
When I send typo POST HTTP request
Then I receive invalid HTTP response code 404 Not Found
And I receive nothing from the page

  Scenario: GET - As an admin I have be able to see posts category number 1
    Given I set GET category api endpoints
    When I send GET category HTTP request
    Then I receive valid HTTP response code 200


  Scenario: GET - As an admin I shouldn't be able to see posts with invalid url
    Given I set typo GET category api endpoints
    When I send typo GET HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: GET - As an admin I have be able to see posts all category number 1
    Given I set GET all category api endpoints
    When I send all category HTTP request
    Then I receive valid HTTP response code 200


  Scenario: GET - As an admin I shouldn't be able to see all  posts with invalid url
    Given I set typo GET all category api endpoints
    When I send typo GET HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: DELETE - As admin I have be able to delete category existing posts
    Given I set DELETE category api endpoints
      When I send DELETE category HTTP request
    Then I receive valid HTTP response code 200

  Scenario: DELETE - As admin I shouldn't be able to delete without input which posts
    Given I set DELETE category to invalid api endpoints
    When I send DELETE Invalid HTTP request
    Then I receive invalid HTTP response code 405 Not Found
    And I receive nothing from the page

