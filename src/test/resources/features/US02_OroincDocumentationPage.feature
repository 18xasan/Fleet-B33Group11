@B33G11-126
Feature: Go to the Oroinc Documentation page by clicking on the question mark icon.

	As a user, I should access to the Oroinc Documentation page. (Window handle)

	@B33G11-123
	Scenario Outline: Verify that users access to the Oroinc Documentation page by clicking the question mark icon.
		Given the user is logged in as "<user type>"
		When User must click on the question mark icon
		Then User should be taken to the Oroinc Documentation page

		Examples:
			| user type     |
			| sales Manager |
			| store Manager |
		    | driver        |