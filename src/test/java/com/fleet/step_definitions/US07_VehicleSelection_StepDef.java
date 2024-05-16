package com.fleet.step_definitions;

import com.fleet.pages.VehiclePage_JSN;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US07_VehicleSelection_StepDef {

    LoginStepDefs loginStepDef = new LoginStepDefs();
    VehiclePage_JSN vehiclePageJsn = new VehiclePage_JSN();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String userType) {
        loginStepDef.the_user_logged_in_as(userType);

    }

    @Given("the user launches the Vehicles page")
    public void theUserLaunchesTheVehiclesPage() {
        BrowserUtils.sleep(3);
        vehiclePageJsn.navigateToModule("Fleet","Vehicles");

    }

    @Then("all checkboxes should be unchecked")
    public void allCheckboxesShouldBeUnchecked() {
        Assert.assertFalse(vehiclePageJsn.masterCheckbox.isSelected());

    }

    @When("the user checks the first checkbox")
    public void theUserChecksTheFirstCheckbox() {
        vehiclePageJsn.masterCheckbox.click();
    }

    @When("the user should be able to select a specific car")
    public void theUserShouldBeAbleToSelectASpecificCar(){
        BrowserUtils.sleep(2);
        for (WebElement checkbox : vehiclePageJsn.checkboxes) {
            checkbox.click();
            Assert.assertTrue(checkbox.isSelected());
        }
    }


}
