Feature: Login functionality

  Scenario: Login to the website successfully
    Given user navigates to the website
    When user click on login link
    And user enter username
    And user enter password
    And user click on login button
    Then user landing on home page


  Scenario: Login to the website successfully
    Given user navigates to the website
    When user click on login link
    And user enter "jsmith" username
    And user enter "demo1234" password
    And user click on login button
    Then user landing on home page
