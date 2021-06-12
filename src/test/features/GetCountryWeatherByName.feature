Feature: Show weather by capital

  Scenario Outline: Show the weather of a specific capital city
    When When the client calls for a specific capital "<city>"
    Then The API returns the weather
    Examples:
    |city|
    |Rome|