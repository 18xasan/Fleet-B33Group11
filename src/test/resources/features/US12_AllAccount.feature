@B33G11-148
Feature: Default


  @B33G11-147

  Scenario: Verify that users see 8 filter customers info on the Account page
    Given user is on the transmuda login page
    Given the user logged in as manager with below credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    Given user move to customers links
    And user clicks accounts page
    Then user should see below filter names
      | Account name  |
      | Contact name  |
      | Contact email |
      | Contact phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |