Feature: this is customized statement feature
  @Sc008
  Scenario: Manager generate the customized statement form
    Given Open a application in url browser
    When Enter the account number is "123456789"
    And Enter from date "01/09/2022"
    And Enter To date "01/10/2022"
    And Enter amount lower limit "3000"
    And enter the number of transaction is "30"
    Then click on the submit buttons