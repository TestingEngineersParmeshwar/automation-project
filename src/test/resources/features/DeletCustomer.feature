Feature: Delete customer from manager
  @Test04
  Scenario: login with valid credentials2
    Given open a application in url browser
    When enter the cutomerId is "mngr446206" and click the submit button
    Then delete customer should be sucessful