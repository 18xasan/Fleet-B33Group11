package com.fleet.step_definitions;

import com.fleet.pages.AllCalendarEventsPage_EJ;
import com.fleet.pages.BasePage;
import com.fleet.pages.CreateCalendarEventPage_EJ;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US10_DescriptionStepDefs extends BasePage {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    AllCalendarEventsPage_EJ allCalendarEventsPageEj = new AllCalendarEventsPage_EJ();

    CreateCalendarEventPage_EJ createCalendarEventPageEj = new CreateCalendarEventPage_EJ();
    @Given("{string} is on the Dashboard page")
    public void isOnTheDashboardPage(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
        BrowserUtils.sleep(4);


    }

    @When("User hover on Activities and clicks on Calendar Events")
    public void userHoverOnActivitiesAndClicksOnCalendarEvents() {
        BrowserUtils.sleep(3);
        navigateToModule("Activities","Calendar Events");
    }

    @And("User clicks on Create Calendar Event")
    public void userClicksOnCreateCalendarEvent() {
        BrowserUtils.sleep(3);
        allCalendarEventsPageEj.createEventButton.click();
    }

    @And("User clicks Repeat checkbox")
    public void userClicksRepeatCheckbox() {
        BrowserUtils.sleep(3);
        createCalendarEventPageEj.repeatCheckbox.click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(createCalendarEventPageEj.repeatCheckbox.isSelected());

    }

    @Then("User should be able to type a {string} at the Description box")
    public void userShouldBeAbleToTypeAAtTheDescriptionBox(String message){
   Driver.getDriver().switchTo().frame(createCalendarEventPageEj.iframe);
   createCalendarEventPageEj.descriptionBox.sendKeys(message+Keys.ENTER);

   Assert.assertEquals(message, createCalendarEventPageEj.descriptionMessage.getText());


    }



}
