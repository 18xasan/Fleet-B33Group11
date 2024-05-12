package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleOdometerPage  extends BasePage{

public VehicleOdometerPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement fleetModule;

@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']")
public List <WebElement> fleet_dropdown;

@FindBy(xpath = "//span[text()='Vehicle Odometer']")
    public WebElement vehicleOdometerOption;

@FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
public WebElement errorMsg;

@FindBy(xpath = "//input[@type='number']")
    public WebElement pageField;

@FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement view_per_page_dropdown;

@FindBy(className = "unclickable")
    public WebElement fleet_module_as_a_driver;

@FindBy(xpath = "//span[text()='Vehicle Odometer']")
    public WebElement vehicle_odometer_as_a_driver;





}





