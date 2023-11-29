Feature: Login functionality with scenario outline

  Scenario Outline: Login to the website successfully
    Given user navigates to the website
    When user click on login link
    And user enter "<username>" username
    And user enter "<password>" password
    And user click on login button
    Then user landing on home page
    Examples:
      | username | password |
      | jsmith   | demo1234 |