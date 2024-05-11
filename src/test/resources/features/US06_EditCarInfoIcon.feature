@B33G11-125
Feature: Edit Car Info Icons Display on Vehicles Page

  As a user,
  I want to see edit car info icons from the Vehicles page.

  @B33G11-124
  Scenario: Verify that users see “view, edit, delete” options when they hover the mouse over the 3 dots “…”
    Given I am on the Vehicles page
    When I hover the mouse over the three dots "..."
    Then I should see the options "view, edit, delete"