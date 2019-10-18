@chromeBrowser
Feature: Halifax Intermediaries on Chrome Browser

Scenario: Chrome Browser Test
    Given I open the chrome browser
    Given I enter halifax intermediaries url
    Given I navigate to home page of halifax intermediaries
    Given I enter invalid credentials
    When I click submit button
    Then I get error message displayed