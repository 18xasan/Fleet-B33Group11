package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage {


        public WebDriver driver;


        public By dashboardsLink = By.cssSelector("a[href='/dashboard']");
        public By fleetLink = By.cssSelector("a[href='/fleet']");
        public By customersLink = By.cssSelector("a[href='/customers']");
        public By salesLink = By.cssSelector("a[href='/sales']");
        public By activitiesLink = By.cssSelector("a[href='/activities']");
        public By marketingLink = By.cssSelector("a[href='/marketing']");
        public By reportsAndSegmentsLink = By.cssSelector("a[href='/reports']");
        public By systemLink = By.cssSelector("a[href='/system']");

        public MainPage() {
            this.driver = Driver.getDriver();
        }

        public void goToMainPage() {

            driver.get("https://qa.transmuda.com/");
        }

        public boolean isDashboardDisplayed() {

            return driver.findElement(dashboardsLink).isDisplayed();
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

        public boolean isReportsAndSegmentsDisplayed() {
            return driver.findElement(reportsAndSegmentsLink).isDisplayed();
        }

        public boolean isSystemDisplayed() {
            return driver.findElement(systemLink).isDisplayed();
        }
    }