Feature: Test Facebook Smoke Scenario

  Scenario Outline: Test login with valid credentials
    Given Open Chrome and start Application
    When I enter valid "<username>" and "<password>"
    Then User should be able to login successfully

    Examples: 
      | username           | password |
      | Testing@gmail.com  |   123456 |
      | Testing1@gmail.com |    12345 |
      | Testing2@gmail.com |  1234567 |
