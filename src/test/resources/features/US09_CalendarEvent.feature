Feature: Default


  @B33G11-121
  Scenario Outline: Verify that users see error messages when enter invalid integers.
    Given the user is on the calendar page
    When the user enters an "<invalid integer>" into the Repeat Every input box
    Then the user should see the "<error message>"

    Examples:
      | invalid integer | error message                          |
      | -1              | The value have not to be less than 1.  |
      | 100             | The value have not to be more than 99. |