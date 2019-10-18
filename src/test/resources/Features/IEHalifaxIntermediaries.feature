@ieBrowser
Feature: Halifax Intermediaries on Safari Browser

Scenario: IE Browser Test
    Given I open the IE browser
    Given I enter halifax intermediaries url
    Given I navigate to home page of halifax intermediaries
    Given I enter invalid credentials
    When I click submit button
    Then I get error message displayed