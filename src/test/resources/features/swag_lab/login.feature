@runAll @sauceDemo @manageLogin @web_app
Feature: Swag lab manage authentication

  ** As a ** Swag lab's user
  ** I want to ** administrate the authentication oh the web app
  ** So that I can *** access of the store

  @loginSuccess
  Scenario Outline: Validate we can login in the web app successful
    Given <clientName> is an user
    When Wants to log in in the Swag lab web app
      | username   | password   |
      | <username> | <password> |
    Then Will be able to see that the login was correct
      | labelLogin   |
      | <labelLogin> |
    Examples:
      | clientName | username      | password     | labelLogin |
      | Sebastian  | standard_user | secret_sauce | Swag Labs  |

