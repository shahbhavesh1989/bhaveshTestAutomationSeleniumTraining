Feature: Google Search

Scenario Outline: Chrome Google Search
	Given I open chrome browser
	And I enter Google URL
	And I search "<searchText>"
	When I click enter
	Then I should get search result page
	
	Examples:
		| searchText |
		| Virtusa |
		| Selenium |
		| Automation |
	
