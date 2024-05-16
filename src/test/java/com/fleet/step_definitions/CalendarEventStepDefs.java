package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarEventPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CalendarEventStepDefs extends BasePage {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    CalendarEventPage calendarEventPage = new CalendarEventPage();
    Actions actions = new Actions(Driver.getDriver());


  //  @Given("user logged in as user")
 //   public void userLoggedInAsUser() {
  //      loginStepDefs.the_user_logged_in_as("driver");
 //   }


    @When("the user clicks the Activities button")
    public void the_user_clicks_the_activities_button() {
        BrowserUtils.sleep(3);
        actions.moveToElement(calendarEventPage.activitiesButton).perform();
    }

    @When("the user clicks the Calendar Events button")
    public void the_user_clicks_the_calendar_events_button() {
        calendarEventPage.calendarEventsButton.click();
    }

    @When("the user clicks the Create Calendar Event button")
    public void the_user_clicks_the_create_calendar_event_button() {
        calendarEventPage.createCalendarEventButton.click();

    }

    @Then("the user check mark the Repeat Button")
    public void theUserCheckMarkTheRepeatButton() {
        calendarEventPage.repeatCheckBox.click();

    }

    @And("if user enter less than {int} in Repeat Every input box user should see {string}")
    public void ifUserEnterLessThanInRepeatEveryInputBoxUserShouldSee(int arg0, String arg1) {


    }

    @And("if user enter more than {int} in Repeat Every input box user should see {string}")
    public void ifUserEnterMoreThanInRepeatEveryInputBoxUserShouldSee(int arg0, String arg1) {


    }

}