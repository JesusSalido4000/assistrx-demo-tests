
Feature: Login functionality on SauceDemo
  As I user I want to login into the app so I can view what is available

  Scenario: Successful login with valid credentials
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should be redirected to the inventory page

  Scenario: Unsuccessful login with invalid credentials
    Given I open the SauceDemo login page
    When I login with username "invalid_user" and password "wrong_password"
    Then I should see an error message

 Scenario: Logout after login
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    And I log out
    Then I should be redirected to the login page

  Scenario Outline: Login attempt with multiple users
   Given I open the SauceDemo login page
   When I login with username "<username>" and password "<password>"
   Then I should be redirected to the inventory page

  Examples:
    | username                | password      |
    | standard_user           | secret_sauce  |
    | problem_user            | secret_sauce  |
    | performance_glitch_user | secret_sauce  |

