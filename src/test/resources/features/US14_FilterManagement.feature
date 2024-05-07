Feature: Filter management on Marketing page

  As a user,
  I want to manage filters on the Marketing page,
  So I can focus on the data related to my needs


  Scenario: Verification of default filter options for Store and Sales managers
    Given I am a Store or Sales manager
    When I navigate to the Marketing page
    Then I should see all 5 filter options as checked by default

  Scenario Outline: Verification of checkbox functionality
    Given I am a user on the Marketing page
    And I see the 5 filter options
    When I uncheck the <number> boxes
    Then the <number> boxes should be unchecked

    Examples:
      | number |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |