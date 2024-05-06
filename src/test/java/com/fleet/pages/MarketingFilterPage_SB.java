package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketingFilterPage_SB {


    public MarketingFilterPage_SB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]/a/span")
    public WebElement marketingButton;

    @FindBy(xpath = "//a[@href='/campaign/']")
    public WebElement campaignButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;

}
