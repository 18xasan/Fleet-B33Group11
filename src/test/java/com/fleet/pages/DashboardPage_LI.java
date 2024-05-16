package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_LI {
    public DashboardPage_LI (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='help no-hash']")
    public WebElement questionMarkIcon;


    public void clickQuestionMarkIcon () {
        questionMarkIcon.click();
    }

}
