package com.fleet.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    // Locators
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("loginBtn");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void loginAsStoreManager() {
        enterUsername("storemanager51");
        enterPassword("UserUser123");
        clickLoginButton();
    }

    public void loginAsSalesManager() {
        enterUsername("salesmanager101");
        enterPassword("UserUser123");
        clickLoginButton();
    }

    public void loginAsTruckDriver() {
        enterUsername("user1");
        enterPassword("UserUser123");
        clickLoginButton();
    }
}