@B33G11-120 @wip
Feature: Vehicles Odometers page verification

	
	@B33G11-117
	Scenario: Verify Vehicle Odometer module functionality for 2 users

		Given the user is on the login page
		Given the user logged in as "sales manager"
		And user clicks Vehicle Odometer option from the Fleet module
		Then user should see expected error message on the page	

	
	@B33G11-118
	Scenario Outline: Verify Vehicle Odometer module functionality for 1 user

		Given the user is on the login page
		When user is successfully logged in with valid "<username>" and "<password>"
		And user clicks Vehicle Odometer option from the Fleet module
		Then user is directed to Vehicles Odometers page and sees the default page as "1".
		
		Examples:
		|username| password|
		|user1| UserUser123|
		|user50| UserUser123|
		|user150| UserUser123|
		|user200| UserUser123|	

	
	@B33G11-119
	 Scenario: Verify the View Per Page as a driver user.

		Given the user is on the login page
	    Given the user logged in as "<userType>"
		And user clicks Vehicle Odometer option from the Fleet module
		Then user is directed to Vehicles Odometers page
	    And user sees the View Per Page as "25" by default.