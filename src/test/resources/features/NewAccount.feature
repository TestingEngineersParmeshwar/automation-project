Feature: New Account
  @Test05
  Scenario: Open new account to manager
    Given open the application a url browser
    When Enter customerId is "mngr447890"
    And Select the account type is "savings"
    And fil the initial deposit is "10000"
    And Click on submit
    Then Open the New account should be successful