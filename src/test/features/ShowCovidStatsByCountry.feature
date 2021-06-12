Feature: Shows the covid statistics by country

  Scenario Outline: Show a specific countrys covid statistics by its name
    When When the Client calls for a specific "<countrys>" covid statistics
    Then Then the info is returned
    Examples:
    |countrys |
    |Lithuania|