@login
Feature: Users should be able to login


  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user login with "<USERNAME>"and "<PASSWORD>"
    Then the user should be able to log in

#    Given the user logged in with username as "User1" and password as "UserUser123"


    Examples:
      | userType      | USERNAME        | PASSWORD    |
      | Store Manager | storemanager51  | UserUser123 |
      | Sales Manager | salesmanager101 | UserUser123 |
      | Truck Driver  | user1           | UserUser123 |

