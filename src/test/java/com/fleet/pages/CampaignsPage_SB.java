package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage_SB {

    public CampaignsPage_SB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='add-filter-button']")
    private WebElement ManageFilterButton;


}


