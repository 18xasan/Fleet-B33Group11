package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.VehiclesCostsPage_KY;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US13_ColumsAndCheckboxStepDefs extends BasePage {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    VehiclesCostsPage_KY vehiclesCostsPageKy = new VehiclesCostsPage_KY();


    @Given("I am a {string} logged into the system")
    public void iAmALoggedIntoTheSystem(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);

    }

    @When("I navigate to the Vehicle Costs page")
    public void iNavigateToTheVehicleCostsPage() {
        navigateToModule("Fleet", "Vehicle Costs");

    }

    @Then("I should see three columns displayed:")
    public void iShouldSeeThreeColumnsDisplayed(List<String> expectedColumnNames) {

        BrowserUtils.sleep(1);

        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(expectedColumnNames.get(i), vehiclesCostsPageKy.columnNames.get(i).getText());

        }

    }


    @And("I click the first checkbox to select all of the checkboxes")
    public void iClickTheFirstCheckboxToSelectAllOfTheCheckboxes() {

        BrowserUtils.sleep(2);
        vehiclesCostsPageKy.checkboxSelectAll.click();
        Assert.assertTrue(vehiclesCostsPageKy.checkboxSelectAll.isSelected());


    }

    @Then("all vehicle costs checkboxes listed on the page should be selected")
    public void allVehicleCostsCheckboxesListedOnThePageShouldBeSelected() {

        for (WebElement checkbox : vehiclesCostsPageKy.checkboxes) {
            Assert.assertTrue(checkbox.isSelected());

        }
    }


}
