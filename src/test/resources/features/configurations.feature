@runAll @manageConfigurations
Feature: Cash stash manage the configurations

  ** As a ** Cash stash's user
  ** I want to ** administrate configurations
  ** So that I can *** customize the transactions in the app


  @addExpensesByValue
  Scenario Outline: Validate that new currency can be selected
    Given <clientName> is a Cash stash's user
    When He wants to select the currency
      | currency   | idCurrency    |
      | <currency> | <id_currency> |

    Examples:

      | currency | id_currency |
      | Armenia  | AMD         |
