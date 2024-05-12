@B33G11-120 @wip
Feature: Vehicles Odometers page verification


  @B33G11-117
  Scenario Outline: Verify Vehicle Odometer module functionality for 2 users

    Given the user is on the login page
    Given the user logged in as "<usertype>"
    When user clicks Vehicle Odometer option from the Fleet module
    Then user should see expected error message on the page

    Examples:
      | usertype      |
      | sales manager |
      | store manager |


  @B33G11-118
  Scenario Outline: Verify Vehicle Odometer module functionality for 1 user

    Given the user is on the login page
    When user is successfully logged in with valid "<username>" and "<password>"
    And user clicks Vehicle Odometer option from the Fleet module
    Then user is directed to Vehicles Odometers page and sees the default page as "1".

    Examples:
      | username | password    |
      | user1    | UserUser123 |
      | user50   | UserUser123 |
    #  | user150  | UserUser123 |
      | user200  | UserUser123 |


  @B33G11-119
  Scenario: Verify the View Per Page as a driver user.

    Given the user is on the login page
    Given the user logged in as "driver"
    When user navigates to Fleet module
    Then user is able to see the below dropdown options
      | Vehicles              |
      | Vehicle Odometer      |
      | Vehicle Costs         |
      | Vehicle Contracts     |
      | Vehicles Fuel Logs    |
      | Vehicle Services Logs |
      | Vehicles Model        |
    When user clicks Vehicle Odometers option
    Then user sees the View Per Page as "25" on the Vehicle Odometer page.
