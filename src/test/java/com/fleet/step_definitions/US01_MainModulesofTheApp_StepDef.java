package com.fleet.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US01_MainModulesofTheApp_StepDef {

    private WebDriver driver;

    @Given("I am a store manager")
    public void iAmAStoreManager() {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        login("storemanager51", "100");
    }

    @Given("I am a truck driver")
    public void iAmATruckDriver() {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        login("user1", "50");
    }

    @When("I access the application")
    public void iAccessTheApplication() {

        driver.get("http://qa.transmuda.com/");
    }

    @Then("I should see the main modules")
    public void iShouldSeeTheMainModules(List<String> expectedModules) {

        for (String moduleName : expectedModules) {
            assertTrue(driver.findElement(By.xpath("//div[contains(text(),'" + moduleName + "')]")).isDisplayed());
        }

        driver.quit();
    }

    private void login(String username, String password) {

        driver.get("http://qa.transmuda.com/login");


        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);


        driver.findElement(By.id("loginBtn")).click();
    }
}