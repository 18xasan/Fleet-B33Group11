package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {

    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("http://qa.transmuda.com/login");
    }

    @When("I enter valid {string} credentials")
    public void iEnterValidCredentials(String role) {
        String username = "";
        String password = "";

        if (role.equals("Store Manager")) {
            username = "storemanager51";
            password = "UserUser123";
        } else if (role.equals("Sales Manager")) {
            username = "salesmanager101";
            password = "UserUser123";
        } else if (role.equals("Truck Driver")) {
            username = "user1";
            password = "UserUser123";
        }

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("click on the login button")
    public void clickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in as a {string}")
    public void iShouldBeLoggedInAsA(String role) {
        mainPage = new MainPage(driver);


        assertTrue(mainPage.isDashboardDisplayed());


    }

    @Then("I should see the main modules for {string}")
    public void iShouldSeeTheMainModulesFor(String role) {
        mainPage = new MainPage(driver);

        if (role.equals("Store Manager")) {
            assertTrue(mainPage.isDashboardDisplayed());
            assertTrue(mainPage.isFleetDisplayed());
            assertTrue(mainPage.isCustomersDisplayed());

        } else if (role.equals("Sales Manager")) {
            assertTrue(mainPage.isDashboardDisplayed());
            assertTrue(mainPage.isSalesDisplayed());
            assertTrue(mainPage.isActivitiesDisplayed());

        } else if (role.equals("Truck Driver")) {
            assertTrue(mainPage.isFleetDisplayed());
            assertTrue(mainPage.isCustomersDisplayed());
            assertTrue(mainPage.isActivitiesDisplayed());
        }
    }

    public void tearDown() {
        driver.quit();
    }
}