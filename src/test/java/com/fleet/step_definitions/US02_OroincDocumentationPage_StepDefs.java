package com.fleet.step_definitions;


import com.fleet.pages.DashboardPage_LI;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class US02_OroincDocumentationPage_StepDefs {

    DashboardPage_LI dashboardPageLi = new DashboardPage_LI();
    LoginStepDefs loginStepDefs = new LoginStepDefs();

    @Given("User is logged in as {string}")
    public void userIsLoggedInAs(String userType) {

        loginStepDefs.the_user_logged_in_as(userType);

        BrowserUtils.waitFor(2);
    }

    @When("User must click on the question mark icon")
    public void userMustClickOnTheQuestionMarkIcon() {

        dashboardPageLi.clickQuestionMarkIcon();

    }
    @Then("User should be taken to the Oroinc Documentation page")
    public void user_should_be_taken_to_the_oroinc_documentation_page() {

        BrowserUtils.switchWindowAndVerify("https://doc.oroinc.com/","Welcome to Oro Documentation");

    }

}
