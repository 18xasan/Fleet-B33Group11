package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.MainPage;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US01_MainModulesofTheApp_StepDef {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    Actions actions = new Actions(Driver.getDriver());

    @Given("I am a store manager")
    public void i_am_a_store_manager() {

        LoginPage loginPage = new LoginPage();
        loginPage.login("store_manager_username", "store_manager_password");
    }

    @When("I access the application")
    public void i_access_the_application() {

        MainPage mainPage = new MainPage();
        mainPage.goToMainPage();
    }

    @Then("I should see the main modules")
    public void i_should_see_the_main_modules() {

        MainPage mainPage = new MainPage();
        assertTrue(mainPage.isDashboardDisplayed());
        assertTrue(mainPage.isFleetDisplayed());
        assertTrue(mainPage.isCustomersDisplayed());
        assertTrue(mainPage.isSalesDisplayed());
        assertTrue(mainPage.isActivitiesDisplayed());
        assertTrue(mainPage.isMarketingDisplayed());
        assertTrue(mainPage.isReportsAndSegmentsDisplayed());
        assertTrue(mainPage.isSystemDisplayed());
    }
}