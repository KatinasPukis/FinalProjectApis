Feature: Show the capital city of a specific country

  Scenario Outline: Get the cpaital city of a country
    When When the Client calls for a specific "<country>"
    Then The API returns the capital city of the country
    Examples:
    |country|
    |Poland|