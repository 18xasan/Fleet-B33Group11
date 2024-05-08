package com.fleet.step_definitions;

import com.fleet.pages.VehiclesPage_KY;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class US06_EditCarInfoIconStepDefinitions {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    VehiclesPage_KY vehiclesPageKy = new VehiclesPage_KY();
    Actions actions = new Actions(Driver.getDriver());


    @Given("^I am on the Vehicles page$")
    public void i_am_on_the_Vehicles_page() {
        loginStepDefs.the_user_logged_in_as("driver");
        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesPageKy.fleetHoverOver).perform();
        BrowserUtils.sleep(2);
        vehiclesPageKy.vehicles.click();
        BrowserUtils.sleep(2);


    }

    @When("^I hover the mouse over the three dots \"([^\"]*)\"$")
    public void i_hover_the_mouse_over_the_three_dots(String threeDots) {
        BrowserUtils.sleep(2);

        actions.moveToElement(vehiclesPageKy.threeDotsHoverOver).perform();
        BrowserUtils.sleep(2);


    }

    @Then("^I should see the options \"([^\"]*)\"$")
    public void i_should_see_the_options(String options) {
        Assert.assertTrue("editIcon is NOT displayed", vehiclesPageKy.editIcon.isDisplayed());
        Assert.assertTrue("editIcon is NOT enabled", vehiclesPageKy.editIcon.isEnabled());
        Assert.assertTrue("viewIcon is NOT displayed", vehiclesPageKy.viewIcon.isDisplayed());
        Assert.assertTrue("viewIcon is NOT enabled", vehiclesPageKy.viewIcon.isEnabled());
        Assert.assertTrue("deleteIcon is NOT displayed", vehiclesPageKy.deleteIcon.isDisplayed());
        Assert.assertTrue("deleteIcon is NOT enabled", vehiclesPageKy.deleteIcon.isEnabled());


    }
}
