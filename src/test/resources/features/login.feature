Feature: Cash stash manage expenses

  ** As a ** Cash stash's user
  ** I want to ** administrate expenses
  ** So that I can *** keep track of my expenses


  @addExpenses
  Scenario Outline: Validate that new expenses can be added
    Given <clientName> is a Cash stash's user

    Examples:

      | clientName | category | value |
      | Fabian     | Comida   | 200   |