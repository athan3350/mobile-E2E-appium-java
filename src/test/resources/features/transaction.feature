@runAll @manageExpenses
Feature: Cash stash manage transactions

  ** As a ** Cash stash's user
  ** I want to ** administrate expenses and incomes
  ** So that I can *** keep track of my expenses and incomes


  @addExpensesByValue
  Scenario Outline: Validate that new expenses can be added by value
    Given <clientName> is a Cash stash's user
    When He wants to add a new expense\income
      | type_transaction | category   | value   |
      | GASTOS           | <category> | <value> |
    Then He will see that his expense\income has been added
      | totalBalance   |
      | <totalBalance> |

    Examples:

      | clientName | category        | value | totalBalance |
      | Sebastian  | Compras         | 34543 | 34,543       |
      | Sebastian  | Entretenimiento | 10293 | 10,293       |


  @addExpensesByKeyBoard
  Scenario Outline: Validate that new expenses can be added by keyBoard
    Given <clientName> is a Cash stash's user
    When He wants to add a new expense\income
      | type_transaction | category   | value   | using_keyboard |
      | GASTOS           | <category> | <value> | true           |
    Then He will see that his expense\income has been added
      | totalBalance   |
      | <totalBalance> |

    Examples:

      | clientName | category | value | totalBalance |
      | Sebastian  | Seguro   | 99652 | 99,652       |
      | Sebastian  | Regalos  | 45652 | 45,652       |