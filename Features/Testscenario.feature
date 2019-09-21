Feature: Google Search Functionality

Scenario: Verification of search functionality
    Given I open the Chrome browser and launch the google url
    And I enter some text in search box
    When I hit return key
    Then google should display search results