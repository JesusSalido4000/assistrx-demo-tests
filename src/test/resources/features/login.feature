
Feature: Login functionality on SauceDemo

  Scenario: Successful login with valid credentials
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should be redirected to the inventory page

  Scenario: Unsuccessful login with invalid credentials
    Given I open the SauceDemo login page
    When I login with username "invalid_user" and password "wrong_password"
    Then I should see an error message
