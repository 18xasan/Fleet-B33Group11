@login
Feature: Users should be able to login


  Scenario: Store Manager Login
    Given I am on the login page
    When I enter valid store manager credentials
    And click on the login button
    Then I should be logged in as a store manager
    And I should see the main modules for store managers

  Scenario: Sales Manager Login
    Given I am on the login page
    When I enter valid sales manager credentials
    And click on the login button
    Then I should be logged in as a sales manager
    And I should see the main modules for sales managers

  Scenario: Truck Driver Login
    Given I am on the login page
    When I enter valid truck driver credentials
    And click on the login button
    Then I should be logged in as a truck driver
    And I should see the main modules for truck drivers

    Examples:
      | ROLE           | USERNAME        | PASSWORD    |
      | Store Manager  | storemanager51  | UserUser123 |
      | Sales Manager  | salesmanager101 | UserUser123 |
      | Truck Driver   | user1           | UserUser123 |

