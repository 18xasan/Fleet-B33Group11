Feature:
	Type into the Description field at Calendar Events. (Iframe)

	@B33G11-142
	Scenario Outline: Verify that users can type messages in to the Description field on the Calendar Events page
		Given "<userType>" is on the Dashboard page
		    When User hover on Activities and clicks on Calendar Events
		    And User clicks on Create Calendar Event
		    And User clicks Repeat checkbox
		    Then User should be able to type a "Scrum daily meeting" at the Description box
		
		    Examples:
		      | userType      |
		      |driver  |
		      | store manager |