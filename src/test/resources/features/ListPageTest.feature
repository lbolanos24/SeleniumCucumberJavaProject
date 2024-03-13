Feature: I can find a city inside a state

@List 
Scenario Outline name: As a test engineer. I want to validate a text is present inside a list
    Given I navigate to the list page
    When I search <state> in list
    Then I can find <city> in the list
    Examples:
        | state       | city                |
        | Washington  | Washington, Seattle |
        | Chicago     | Chicago, Illinois   |
        