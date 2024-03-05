Feature: search criteria in Google

Scenario: as a user I enter a search criteria in Google
Given I am in the Google search page
When I enter a search criteria
And click on the search button
Then the results match the criteria