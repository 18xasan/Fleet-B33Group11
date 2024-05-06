Feature: Edit Car Info Icons Display on Vehicles Page

  As a user,
  I want to see edit car info icons from the Vehicles page.

  Scenario: Hovering over the "..." displays "view, edit, delete" options
    Given I am on the Vehicles page
    When I hover the mouse over the three dots "..."
    Then I should see the options "view, edit, delete"
