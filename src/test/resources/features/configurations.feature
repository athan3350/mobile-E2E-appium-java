@runAll @manageConfigurations

Feature: Cash stash manage the configurations

  ** As a ** Cash stash's user
  ** I want to ** administrate configurations
  ** So that I can *** customize the transactions in the app


  @selectCurrencyMainMenu
  Scenario Outline: Validate that new currency can be selected from the main menu
    Given <clientName> is a Cash stash's user
    When He wants to select the currency from the main menu
      | currency   | id_currency   |
      | <currency> | <id_currency> |
    And He will be able to see that he can transact in his new currency <id_currency>

    Examples:

      | currency | id_currency |
      | Albania  | ALL         |
      | Armenia  | AMD         |

  @selectCurrencyTransaction
  Scenario Outline: Validate that new currency can be selected from the transaction module
    Given <clientName> is a Cash stash's user
    When He wants to select the currency from the transaction module
      | currency   | id_currency   |
      | <currency> | <id_currency> |
    And He will be able to see that he can transact in his new currency <id_currency>

    Examples:

      | currency | id_currency |
      | Albania  | ALL         |
      | Armenia  | AMD         |
