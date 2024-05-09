package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class MarketingFilterPage_SB {


    public MarketingFilterPage_SB() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='unclickable'])[6]")
    public WebElement marketingButton;
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[6]/div/div/ul/li[3]/a")
    public WebElement campaignButton;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;
    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement smallManageFilterButton;
    @FindBy(css = "input[value='name']")
    public WebElement nameFilter;
    @FindBy(css = "input[value='code']")
    public WebElement codeFilter;
    @FindBy(css = "input[value='startDate']")
    public WebElement startDateFilter;
    @FindBy(css = "input[value='endDate']")
    public WebElement endDateFilter;
    @FindBy(css = "input[value='budget']")
    public WebElement budgetFilter;


    public List<WebElement> getAllFilters() {
        return Arrays.asList(nameFilter, codeFilter,
                startDateFilter, endDateFilter, budgetFilter);
    }


}











