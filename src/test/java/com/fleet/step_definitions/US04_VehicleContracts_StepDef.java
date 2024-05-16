package com.fleet.step_definitions;

import com.fleet.pages.VehicleContractsPage_HB;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class US04_VehicleContracts_StepDef {
    VehicleContractsPage_HB vehicleContractsPage_hb = new VehicleContractsPage_HB();
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user is logged in to the system as a {string}")
    public void userIsLoggedInToTheSystemAsA(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }

    @When("user Hoverover to the fleet Button")
    public void userHoveroverToTheFleetButton() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleContractsPage_hb.fleetButton).perform();

    }

    @And("user Clicks on the Vehicle Contracts Button")
    public void userClicksOnTheVehicleContractsButton() {
        vehicleContractsPage_hb.vehicleContractButton.click();
    }

    @Then("user should see the Expected Title")
    public void userShouldSeeTheExpectedTitle() {
        String expectedUrl1 = "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";
        String actualUrl1 = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl1, expectedUrl1);

    }

    @Then("user should see the Expected Url")
    public void userShouldSeeTheExpectedUrl() {
        String expectedUrl = "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Given("user logged in as a Driver")

    public void userLoggedInAsADriver() {
        BrowserUtils.sleep(2);
        loginStepDefs.the_user_logged_in_as("driver");

//        Alert alert = Driver.getDriver().switchTo().alert();
//        BrowserUtils.sleep(3);
//        alert.accept(); // To click on "OK"

    }

    @When("user navigate to the Vehicle Contracts page")
    public void userNavigateToTheVehicleContractsPage() {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleContractsPage_hb.driverFleetButton).perform();
        vehicleContractsPage_hb.vehicleContractButton.click();

    }

    @Then("user should see a message {string}")
    public void userShouldSeeAMessage(String expectedDeniedMessage) {
        Assert.assertEquals(vehicleContractsPage_hb.actualDeniedMessage.getText(), expectedDeniedMessage);

    }

    @Given("user is logged in to the system sales manager")
    public void userIsLoggedInToTheSystemSalesManager() {
        loginStepDefs.the_user_logged_in_as("sales manager");

    }

    @Given("user is logged in to the system store manager")
    public void userIsLoggedInToTheSystemStoreManager() {
        loginStepDefs.the_user_logged_in_as("store manager");
    }


}
