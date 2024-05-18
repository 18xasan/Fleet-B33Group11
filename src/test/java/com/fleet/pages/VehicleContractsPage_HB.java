package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage_HB {

    public VehicleContractsPage_HB(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//div[@id='main-menu']/ul/li/a)[2]")
    public WebElement fleetButton;


    @FindBy (xpath = "(//div/ul/li[6]/a)[3]")
  public WebElement vehicleContractButton;

    @FindBy(className = "unclickable")
    public WebElement driverFleetButton;

    @FindBy (xpath = "(//div[@class='message'])[2]")
    public WebElement actualDeniedMessage;

}
