package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleOdometerPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks Vehicle Odometer option from the Fleet module")
    public void user_clicks_vehicle_odometer_option_from_the_fleet_module() {

        actions.moveToElement(vehicleOdometerPage.fleetModule).perform();
        actions.moveToElement(vehicleOdometerPage.vehicleOdometerOption).click().perform();


    }

    @Then("user should see expected error message on the page")
    public void user_should_see_expected_error_message_on_the_page() {
        Assert.assertTrue(vehicleOdometerPage.errorMsg.isDisplayed());
        Assert.assertEquals("You do not have permission to perform this action.", vehicleOdometerPage.errorMsg.getText());

    }


    LoginPage loginPage = new LoginPage();

    @When("user is successfully logged in with valid {string} and {string}")
    public void userIsSuccessfullyLoggedInWithValidAnd(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("user is directed to Vehicles Odometers page and sees the default page as {string}.")
    public void userIsDirectedToVehiclesOdometersPageAndSeesTheDefaultPageAs(String defaultPageValue) {
        actions.moveToElement(vehicleOdometerPage.fleet_module_as_a_driver).perform();
        actions.moveToElement(vehicleOdometerPage.vehicle_odometer_as_a_driver).click();

    }


    @Then("user is directed to Vehicles Odometers page")
    public void userIsDirectedToVehiclesOdometersPage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vehicle Odometer"));
    }

    @And("user sees the View Per Page as {string} by default.")
    public void userSeesTheViewPerPageAsByDefault(String defaultValue) {
        String actual = vehicleOdometerPage.pageField.getAttribute("value");
        Assert.assertEquals(defaultValue, actual);
    }
}
