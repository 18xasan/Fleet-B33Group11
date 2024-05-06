package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage_KY {

    public VehiclesPage_KY(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement vehicles;

    @FindBy(linkText = "...")
    public WebElement threeDots;
}
