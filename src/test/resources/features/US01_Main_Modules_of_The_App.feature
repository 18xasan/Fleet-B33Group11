@B33G11-133
Feature: Access to all the main modules verification


	@B33G11-131
	Scenario: US01AC1 Store and Sales managers see 8 module names
		Given I am a store manager
		When I access the application
		Then I should see the main modules
		      | Dashboards         |
		      | Fleet              |
		      | Customers          |
		      | Sales              |
		      | Activities         |
		      | Marketing          |
		      | Reports & Segments |
		      | System             |	


	@B33G11-132
	Scenario: US01AC2 Drivers see 4 module names
		Given I am a truck driver
		When I access the application
		Then I should see the main modules
		      | Fleet            |
		      | Customers        |
		      | Activities       |
		      | System           |