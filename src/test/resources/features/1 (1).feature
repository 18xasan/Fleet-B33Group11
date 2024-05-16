@B33G11-122
Feature: Default

	
	@B33G11-121
	Scenario: Verify that users see error messages when enter invalid integers.
		Given the user is on the calendar page
		    When the user enters an invalid integer into the Repeat Every input box
#		    Then the user should see the corresponding error message
#		      | Entered Value | Expected Error Message                        |
#		      | -1            | "The value should not be less than 1."        |
#		      | 100           | "The value should not be more than 99."       |