Feature: This is add New Customer feature

  Scenario: add new customer valid credential
    Given Open add customer url in browser
    When  add the customer name 'Parmeshwar'
    And   add date of customer '01/25/1990
    And   add address of customer 'Manjri BK, Hadapsar, pune' city 'pune'
    And   add state 'Maharastra' pin '412307'
    And   add telephone number '9767434504' and Email id 'psalunke.terna@gmail.com'
    Then  add customer should be successful
