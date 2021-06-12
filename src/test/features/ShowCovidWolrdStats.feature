Feature: Show all global Covid19 statistics

  Scenario: Show the global covid pandemic statistics
    When The client calls a get request
    Then The API returns global covid19 stats