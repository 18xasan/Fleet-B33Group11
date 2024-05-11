@B33G11-129
Feature: Verify columns on the Vehicle Costs page and selection of all vehicle costs


  @B33G11-127
  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page.
    Given I am a "<userType>" logged into the system
    When I navigate to the Vehicle Costs page
    Then I should see three columns displayed:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    Examples:
      | userType      |
      | store manager |
      | sales manager |


  @B33G11-128
  Scenario Outline: Verify that users can check the first checkbox to select All Vehicle Costs
    Given I am a "<userType>" logged into the system
    When I navigate to the Vehicle Costs page
    And I click the first checkbox to select all of the checkboxes
    Then all vehicle costs checkboxes listed on the page should be selected
    Examples:
      | userType      |
      | store manager |
      | sales manager |