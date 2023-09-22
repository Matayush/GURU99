Feature: Login
  Scenario: Correct Credentials
    Given I open browser
    And I go to login page
    When I type "mngr525086" as login
    And I type "123456@" as password
    And I click login button
    Then I am logged in

  Scenario: Incorrect Credentials
    Given I open browser
    And I go to login page
    When I type "mngr525086" as login
    And I type "IncorrectPassword" as password
    And I click login button
    Then I am NOT logged in
