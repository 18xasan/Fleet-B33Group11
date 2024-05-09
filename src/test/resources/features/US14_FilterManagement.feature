@wip
Feature: Marketing Filter Management

  As a user
  I want to manage filters on the Marketing page
  So that the visibility and accessibility of contents can be controlled


  Scenario Outline: Default filter options for Sales managers and store manager
    Given the user is logged as a "<userType>"
    When the user clicks the Marketing button
    When the user clicks the Campaigns button
    And the user clicks the small Marketing button
    Then all filter options should be checked by default
    When the user tries to uncheck any filter box
    Then the system should allow unchecking any amount of boxes
    Examples:
      | userType      |
      | Sales Manager |
      | Store Manager |






















