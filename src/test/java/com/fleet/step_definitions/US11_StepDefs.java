package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleOdometerPage;

import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

import java.util.List;

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
        System.out.println("vehicleOdometerPage.errorMsg = " + vehicleOdometerPage.errorMsg);
        Assert.assertTrue(vehicleOdometerPage.errorMsg.isDisplayed());
        Assert.assertEquals("You do not have permission to perform this action.", vehicleOdometerPage.errorMsg.getText());

    }


    LoginPage loginPage = new LoginPage();

    @Given("user is successfully logged in with valid {string} and {string}")
    public void userIsSuccessfullyLoggedInWithValidAnd(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("user is directed to Vehicles Odometers page and sees the default page as {string}.")
    public void userIsDirectedToVehiclesOdometersPageAndSeesTheDefaultPageAs(String defaultPageValue) {
//        actions.moveToElement(vehicleOdometerPage.fleet_module_as_a_driver).perform();
//        vehicleOdometerPage.vehicle_odometer_as_a_driver.click();
        vehicleOdometerPage.navigateToModule("Fleet","Vehicle Odometer");
        System.out.println("vehicleOdometerPage.pageField.getAttribute(\"value\") = " + vehicleOdometerPage.pageField.getAttribute("value"));
        Assert.assertEquals(defaultPageValue, vehicleOdometerPage.pageField.getAttribute("value"));


    }


    @Then("user is directed to Vehicles Odometers page")
    public void userIsDirectedToVehiclesOdometersPage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vehicle Odometer"));
    }

    @And("user sees the View Per Page as {string} by default.")
    public void userSeesTheViewPerPageAsByDefault(String defaultValue) {
        String actual = vehicleOdometerPage.view_per_page_dropdown.getText();
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("actual = " + actual);
        Assert.assertEquals(defaultValue, actual);
    }

    @When("user navigates to Fleet module")
    public void userNavigatesToFleetModule() {
        actions.moveToElement(vehicleOdometerPage.fleet_module_as_a_driver).perform();

    }

    @Then("user is able to see the below options")
    public void user_is_able_to_see_the_below_dropdown_options(List<String> dropdownOptions) {
       List<String> actual = new ArrayList<>();
       for (WebElement option : vehicleOdometerPage.fleet_dropdown) {
           actual.add(option.getText());
       }
        System.out.println("dropdownOptions = " + dropdownOptions);
        System.out.print("actual = " + actual);
       Assert.assertEquals(dropdownOptions, actual);


    }



    @When("user clicks on Vehicle Odometers option")
    public void userClicksVehicleOdometersOption() {
        actions.moveToElement(vehicleOdometerPage.vehicle_odometer_as_a_driver).perform();
        vehicleOdometerPage.vehicle_odometer_as_a_driver.click();

    }

    @Then("user sees the View Per Page as {string} on the Vehicle Odometer page.")
    public void userSeesTheViewPerPageAsOnTheVehicleOdometerPage(String defValue) {
        System.out.println("vehicleOdometerPage.view_per_page_dropdown.getText() = " + vehicleOdometerPage.view_per_page_dropdown.getText());
        System.out.println("defValue = " + defValue);
        Assert.assertEquals(defValue,vehicleOdometerPage.view_per_page_dropdown.getText());
    }


}
