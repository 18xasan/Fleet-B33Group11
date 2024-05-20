package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarEventPage_MO;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class US09_CalendarEventStepDefs extends BasePage {
    CalendarEventPage_MO calendarEventPage = new CalendarEventPage_MO();
    LoginStepDefs loginStepDef = new LoginStepDefs();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the calendar page")
    public void the_user_is_on_the_calendar_page() {
        loginStepDef.the_user_logged_in_as("Driver");
        navigateToModule("Activities", "Calendar Events");
    }

    @When("the user enters an {string} into the Repeat Every input box")
    public void theUserEntersAnIntoTheRepeatEveryInputBox(String invalidInteger) {
        BrowserUtils.sleep(2);
        calendarEventPage.createCalendarEventButton.click();
        BrowserUtils.sleep(2);
        calendarEventPage.repeatCheckBox.click();
        BrowserUtils.sleep(2);
        calendarEventPage.repeatEveryInputBox.click();
        BrowserUtils.sleep(2);

        calendarEventPage.repeatEveryInputBox.clear();
        BrowserUtils.sleep(2);
        calendarEventPage.repeatEveryInputBox.sendKeys(invalidInteger);
        BrowserUtils.sleep(2);

    }


    @Then("the user should see the {string}")
    public void theUserShouldSeeThe(String expectedErrorMessage) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedErrorMessage, calendarEventPage.partialErrorMessage.getText());

    }
}

