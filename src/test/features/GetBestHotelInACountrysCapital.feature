Feature: Show the best hotel in a country

  Scenario Outline: Show the best hotel in a countrys capital
    When When the Client calls for a specific "<country>" and a "<capital>"
    Then The API returns the best hotel
    Examples:
    |country|capital|
    |France|Paris|