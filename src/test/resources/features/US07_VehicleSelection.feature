
Feature: Vehicle Selection on Vehicles Page

  As a Sales and Store manager,
  I want to be able to select any vehicle from the Vehicles page web table.

  Scenario Outline: Verify checkboxes on Vehicles page
    Given the user is logged in as "<user type>"
    Given the user launches the Vehicles page
    Then all checkboxes should be unchecked
    Examples:
      | user type     |
      | Sales Manager |
      | Store Manager |


  Scenario Outline: Select all cars using the first checkbox
    Given the user is logged in as "<user type>"
    Given the user launches the Vehicles page
    When the user checks the first checkbox
    Examples:
      | user type     |
      | Sales Manager |
      | Store Manager |




  @jason

  Scenario Outline: Select all cars using the first checkbox
    Given the user is logged in as "<user type>"
    Given the user launches the Vehicles page
    When the user should be able to select a specific car
    Examples:
      | user type     |
      | Sales Manager |
      | Store Manager |
