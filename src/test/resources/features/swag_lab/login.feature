@runAll @sauceDemo @manageLogin
Feature: Swag lab manage authentication

  ** As a ** Swag lab's user
  ** I want to ** administrate the authentication oh the web app
  ** So that I can *** access of the store

  @web_app
  Scenario Outline: Validate we can login in the web app successful
    Given <clientName> is an user
    When Wants to log in in the Swag lab web app
      | username   | password   |
      | <username> | <password> |

    Examples:
      | clientName | username      | password     |
      | Sebastian  | standard_user | secret_sauce |
