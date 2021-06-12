Feature: Get country by name

  Scenario Outline: Get country by name and get code
    When When the client calls for a specific "<country>"
    Then HTTP status code is <statuscode>
    Then The API returns country
    Examples:
    |country  |statuscode |
    |Lithuania|200        |
    |Russia   |200        |
    |asdasd   |404        |
    |notvalid |404        |