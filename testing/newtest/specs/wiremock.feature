Feature: test
  @SmokeTest
  Scenario: wiremock

    Given the loaded data is 01078913
    Given the endpoint is ready
    When the endpoint is called
    Then stuff happens