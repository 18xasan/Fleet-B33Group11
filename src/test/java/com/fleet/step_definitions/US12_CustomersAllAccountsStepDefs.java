package com.fleet.step_definitions;

import com.fleet.pages.CustomersAllAccountsPage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class US12_CustomersAllAccountsStepDefs {


    LoginPage loginPage = new LoginPage();

    CustomersAllAccountsPage  allAccountsPage = new CustomersAllAccountsPage();


    @Given("user is on the transmuda login page")
    public void user_is_on_the_transmuda_login_page() {
       Driver.getDriver().get("https://qa.transmuda.com/user/login");
    }

    // implementation with Configuration Properties
    /*
    @Given("the user logged in as manager")
    public void the_user_logged_in_as_manager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        loginPage.submit.click();

    }
     */


    @Given("the user logged in as manager with below credentials")
    public void the_user_logged_in_as_manager_with_below_credentials(Map<String, String> credentials) {

        loginPage.userName.sendKeys(credentials.get("username"));
        loginPage.password.sendKeys(credentials.get("password"));
        loginPage.submit.click();

    }

    @Given("user move to customers links")
    public void user_move_to_customers_links() {
        allAccountsPage.customersLink.click();

    }

    @Given("user clicks accounts page")
    public void user_clicks_accounts_page() {

        allAccountsPage.accountLink.click();

        allAccountsPage.filtersLink.click();

    }


    /*
    @Then("user should see eight expected filter names")
    public void user_should_see_eight_expected_filter_names() {
        allAccountsPage.manageFilterButton.click();

        allAccountsPage.checkboxAccountName.isDisplayed();
        allAccountsPage.checkboxContactName.isDisplayed();
        allAccountsPage.checkboxOwner.isDisplayed();
        allAccountsPage.checkboxContactPhone.isDisplayed();
        allAccountsPage.checkboxBusinessUnit.isDisplayed();
        allAccountsPage.checkboxCreatedAt.isDisplayed();
        allAccountsPage.checkboxUpdatedAt.isDisplayed();
        allAccountsPage.checkboxContactEmail.isDisplayed();

        System.out.println("allAccountsPage.checkboxAccountName.getText() = " + allAccountsPage.checkboxAccountName.getText());
    }


     */


    @Then("user should see below filter names")
    public void user_should_see_below_filter_names(List<String> expectedFiltersName) {


        Assert.assertEquals(allAccountsPage.checkboxAccountName.getAttribute("title"),expectedFiltersName.get(0));

        Assert.assertEquals(allAccountsPage.checkboxContactName.getAttribute("title"),expectedFiltersName.get(1));
        Assert.assertEquals(allAccountsPage.checkboxContactEmail.getAttribute("title"),expectedFiltersName.get(2));
        Assert.assertEquals(allAccountsPage.checkboxContactPhone.getAttribute("title"),expectedFiltersName.get(3));
        Assert.assertEquals(allAccountsPage.checkboxOwner.getAttribute("title"),expectedFiltersName.get(4));
        Assert.assertEquals(allAccountsPage.checkboxBusinessUnit.getAttribute("title"),expectedFiltersName.get(5));
        Assert.assertEquals(allAccountsPage.checkboxCreatedAt.getAttribute("title"),expectedFiltersName.get(6));
        Assert.assertEquals(allAccountsPage.checkboxUpdatedAt.getAttribute("title"),expectedFiltersName.get(7));


    }

}
