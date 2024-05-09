package com.fleet.step_definitions;


import com.fleet.pages.MarketingFilterPage_SB;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class US14_MarketingFilterStepDefs {

    MarketingFilterPage_SB marketingFilterPage = new MarketingFilterPage_SB();
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is logged as a {string}")
    public void theUserIsLoggedAsA(String userType) {
        loginStepDefs.the_user_logged_in_as(userType);
    }

    @When("the user clicks the Marketing button")
    public void the_user_clicks_the_marketing_button() {
        BrowserUtils.sleep(2);
        actions.moveToElement(marketingFilterPage.marketingButton).perform();

    }

    @When("the user clicks the Campaigns button")
    public void the_user_clicks_the_campaigns_button() {
        marketingFilterPage.campaignButton.click();
    }

    @And("the user clicks the small Marketing button")
    public void theUserClicksTheSmallMarketingButton() {
        marketingFilterPage.smallManageFilterButton.click();
    }

    @Then("all filter options should be checked by default")
    public void all_filter_options_should_be_checked_by_default() {
        marketingFilterPage.manageFilterButton.click();
        for (WebElement filter : marketingFilterPage.getAllFilters()) {
            BrowserUtils.sleep(2);
            Assert.assertTrue(filter.isSelected());
        }

    }


    @When("the user tries to uncheck any filter box")
    public void the_user_tries_to_uncheck_any_filter_box() {
        for (WebElement filter : marketingFilterPage.getAllFilters()) {
            BrowserUtils.sleep(2);
           filter.click();
        }
    }

    @Then("the system should allow unchecking any amount of boxes")
    public void the_system_should_allow_unchecking_any_amount_of_boxes() {
        for (WebElement filter : marketingFilterPage.getAllFilters()) {
            Assert.assertFalse(filter.isSelected());
        }

    }


}
