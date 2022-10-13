Feature: login to Guru99

  Scenario: Login with valid credential
    Given i open guru99 borwser
    When i enter username password
    Then login is successful