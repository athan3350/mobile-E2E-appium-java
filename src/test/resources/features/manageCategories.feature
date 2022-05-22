@runAll @manageExpenses
Feature: Cash stash manage categories

  ** As a ** Cash stash's user
  ** I want to ** administrate the categories
  ** So that I can *** organize the categories of my expenses and income


  @addCategoryMain
  Scenario Outline: validate enter an expense type category from the main menu
    Given <clientName> is a Cash stash's user
    When He wants to add a new category
      | type_transaction | category   | hexadecimal_color   |
      | GASTOS           | <category> | <hexadecimal_color> |
    Then He could see that the new category will be added

    Examples:

      | clientName | category    | hexadecimal_color |
      | Sebastian  | Universidad | 00897B            |
