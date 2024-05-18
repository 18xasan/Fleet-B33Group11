package com.fleet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    // Locators for main modules
    private By dashboardsLink = By.cssSelector("a[href='/dashboard']");
    private By fleetLink = By.cssSelector("a[href='/fleet']");
    private By customersLink = By.cssSelector("a[href='/customers']");
    private By salesLink = By.cssSelector("a[href='/sales']");
    private By activitiesLink = By.cssSelector("a[href='/activities']");
    private By marketingLink = By.cssSelector("a[href='/marketing']");
    private By reportsAndSegmentsLink = By.cssSelector("a[href='/reports']");
    private By systemLink = By.cssSelector("a[href='/system']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToDashboards() {
        driver.findElement(dashboardsLink).click();
    }

    public void goToFleet() {
        driver.findElement(fleetLink).click();
    }

    public void goToCustomers() {
        driver.findElement(customersLink).click();
    }

    public void goToSales() {
        driver.findElement(salesLink).click();
    }

    public void goToActivities() {
        driver.findElement(activitiesLink).click();
    }

    public void goToMarketing() {
        driver.findElement(marketingLink).click();
    }

    public void goToReportsAndSegments() {
        driver.findElement(reportsAndSegmentsLink).click();
    }

    public void goToSystem() {
        driver.findElement(systemLink).click();
    }
}