package com.fleet.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class US06_EditCarInfoIconStepDefinitions {

    @Given("^I am on the Vehicles page$")
    public void i_am_on_the_Vehicles_page() {

    }

    @When("^I hover the mouse over the three dots \"([^\"]*)\"$")
    public void i_hover_the_mouse_over_the_three_dots(String threeDots) {
        // Write code to simulate hovering over the three dots
        // For example:
        // Actions actions = new Actions(driver);
        // actions.moveToElement(driver.findElement(By.cssSelector(threeDots))).perform();
    }

    @Then("^I should see the options \"([^\"]*)\"$")
    public void i_should_see_the_options(String options) {
        String[] expectedOptions = options.split(", ");
        // Write code to get the actual options from the page
        // For example:
        // List<WebElement> actualOptions = driver.findElements(By.cssSelector(".options"));
        // String[] actualOptionsText = actualOptions.stream().map(WebElement::getText).toArray(String[]::new);
        // Compare expectedOptions with actualOptionsText
        // assertTrue(Arrays.equals(expectedOptions, actualOptionsText));
    }
}
