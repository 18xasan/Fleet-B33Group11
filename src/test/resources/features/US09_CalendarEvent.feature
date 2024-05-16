Feature: Error Messages for Invalid Integer Input in Calendar Repeat Every

  As a user, I should see error messages when I enter an invalid integer number into the calendar Repeat Every input box.

  Scenario: Display error message for entering invalid integer values
    Given the user is on the calendar page
    When the user enters an invalid integer into the Repeat Every input box
    Then the user should see the corresponding error message
      | Entered Value | Expected Error Message                        |
      | -1            | "The value should not be less than 1."        |
      | 100           | "The value should not be more than 99."       |



