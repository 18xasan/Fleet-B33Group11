package com.fleet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private final WebDriver driver;


    private final By dashboardLink = By.xpath("//a[contains(text(),'Dashboards')]");
    private final By fleetLink = By.xpath("//a[contains(text(),'Fleet')]");
    private final By customersLink = By.xpath("//a[contains(text(),'Customers')]");
    private final By salesLink = By.xpath("//a[contains(text(),'Sales')]");
    private final By activitiesLink = By.xpath("//a[contains(text(),'Activities')]");
    private final By marketingLink = By.xpath("//a[contains(text(),'Marketing')]");
    private final By reportsSegmentsLink = By.xpath("//a[contains(text(),'Reports & Segments')]");
    private final By systemLink = By.xpath("//a[contains(text(),'System')]");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardLink).isDisplayed();
    }

    public boolean isFleetDisplayed() {
        return driver.findElement(fleetLink).isDisplayed();
    }

    public boolean isCustomersDisplayed() {
        return driver.findElement(customersLink).isDisplayed();
    }

    public boolean isSalesDisplayed() {
        return driver.findElement(salesLink).isDisplayed();
    }

    public boolean isActivitiesDisplayed() {
        return driver.findElement(activitiesLink).isDisplayed();
    }

    public boolean isMarketingDisplayed() {
        return driver.findElement(marketingLink).isDisplayed();
    }

    public boolean isReportsSegmentsDisplayed() {
        return driver.findElement(reportsSegmentsLink).isDisplayed();
    }

    public boolean isSystemDisplayed() {
        return driver.findElement(systemLink).isDisplayed();
    }
}