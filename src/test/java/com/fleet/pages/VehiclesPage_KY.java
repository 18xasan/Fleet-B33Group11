package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage_KY {

    public VehiclesPage_KY(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(className = "unclickable")
    public WebElement fleetHoverOver;

    @FindBy(xpath = "(//a/span)[2]")
    public WebElement vehicles;

    @FindBy(xpath = "(//td/div/div/a)[1]")
    public WebElement threeDotsHoverOver;

    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    public WebElement editIcon;

    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement viewIcon;

    @FindBy(xpath = "(//a[@title='Delete'])[1]")
    public WebElement deleteIcon;
  
    @FindBy(linkText = "...")
    public WebElement threeDots;


}
