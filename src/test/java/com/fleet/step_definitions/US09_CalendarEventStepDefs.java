package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarEventPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class US09_CalendarEventStepDefs extends BasePage {
CalendarEventPage calendarEventPage = new CalendarEventPage();
LoginStepDefs loginStepDef = new LoginStepDefs();
Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the calendar page")
    public void the_user_is_on_the_calendar_page() {
     loginStepDef.the_user_logged_in_as("Driver");
     navigateToModule("Activities","Calendar Events");
    }
    @When("the user enters an invalid integer into the Repeat Every input box")
    public void the_user_enters_an_invalid_integer_into_the_repeat_every_input_box() {
        BrowserUtils.sleep(2);
        calendarEventPage.createCalendarEventButton.click();
        BrowserUtils.sleep(2);
        calendarEventPage.repeatCheckBox.click();
        BrowserUtils.sleep(2);
        calendarEventPage.repeatEveryInputBox.sendKeys("-5");
        BrowserUtils.sleep(2);
    }
//    @Then("the user should see the corresponding error message")
//    public void the_user_should_see_the_corresponding_error_message(Map<Integer,String> expectedResult) {
//   // String actualResult = calendarEventPage.negativeNumberErrorMessage.getText();
//    Map<Integer,String> actualResultMap = new HashMap<Integer,String>();
//    calendarEventPage.negativeNumberErrorMessage.getText();
//    Assert.assertTrue(actualResultMap.equals(expectedResult));
//
//
//    }
}
