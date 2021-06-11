Feature: Show a countrys info by its name

  Scenario Outline: Show a country by its name
    When When the Client calls for a specific country by "<name>"
    Then It will send back the countrys info
    Examples:
    |name     |
    |Lithuania|
