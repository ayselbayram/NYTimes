Feature: Verify all the modules

  Scenario Outline: Verify all the modules
    Then verify "<module>" is displayed
    Examples:
      | module |
      | Art    |
      | World  |
      | Sports |
      | Books  |
      | Style  |