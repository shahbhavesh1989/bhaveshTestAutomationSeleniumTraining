Feature: Google Search

Scenario: Chrome Google Search
	Given I open chrome browser
	And I enter Google URL
	And I search virtusa 
	When I click enter
	Then I should get search result page
	
