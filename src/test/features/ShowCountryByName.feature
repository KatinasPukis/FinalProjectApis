Feature: Show a country by its name

  Scenario Outline: Show a specific country by its name
    When When the Client calls for a specific country
    Then The country is returned with its "<info>"
    Examples:
    |info     |
    |Lithuania|