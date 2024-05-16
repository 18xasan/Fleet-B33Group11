@huseyin
Feature: Access Vehicle Contracts Page
  As a user
  I want to access the Vehicle Contracts page
  So that I can view and manage my vehicle contracts

  Scenario Outline: user navigates to the Vehicle Contracts page
    Given user is logged in to the system as a "<user Type>"
    When  user Hoverover to the fleet Button
    And   user Clicks on the Vehicle Contracts Button
    Then  user should see the Expected Url

    Examples:
      | user Type     |
      | sales manager |
      | store manager |


  Scenario: Driver attempts to access the Vehicle Contracts page
    Given user logged in as a Driver
    When user navigate to the Vehicle Contracts page
    Then user should see a message "You do not have permission to perform this action."
