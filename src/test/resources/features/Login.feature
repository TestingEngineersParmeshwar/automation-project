@Login
Feature: login to Guru99
  Scenario: Login with valid credential
    Given i open application guru99 in browser
    When i enter username 'mngr447890', password 'YherEme' click to login
    Then login is successful