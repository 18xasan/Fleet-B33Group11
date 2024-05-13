package com.fleet.step_definitions;


import com.fleet.pages.DashboardPage_LI;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US02_OroincDocumentationPage_StepDefs {

    LoginStepDefs loginStepDefs = new LoginStepDefs();
    DashboardPage_LI dashboardPageLi = new DashboardPage_LI();



    @Given("User on the Dashboard page")
    public void user_on_the_dashboard_page() {
        loginStepDefs.the_user_logged_in_as("sales manager");
        BrowserUtils.waitFor(3);
    }
    @When("User must click on the Get Help button")
    public void user_must_click_on_the_get_help_button() {
        dashboardPageLi.clickGetHelpButton();

    }
    @Then("User should be taken to the Oroinc Documentation page")
    public void user_should_be_taken_to_the_oroinc_documentation_page() {

        BrowserUtils.switchWindowAndVerify("https://doc.oroinc.com/","Welcome to Oro Documentation");





    }
}
