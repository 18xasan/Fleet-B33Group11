@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@login2
  Scenario:Verify login with different user types
    Given the user logged in as "<userType>"
#    Given the user logged in with username as "Store Manager" and password as "UserUser123"




