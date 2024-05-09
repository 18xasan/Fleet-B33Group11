@B33G11-126
Feature: Go to the Oroinc Documentation page by clicking on the question mark icon.

	As a user, I should access to the Oroinc Documentation page. (Window handle)

	@B33G11-123
	Scenario: Verify that users access to the Oroinc Documentation page by clicking the question mark icon.
		Given User on the Dashboard page
		When User must click on the Get Help button
		Then User should be taken to the Oroinc Documentation page