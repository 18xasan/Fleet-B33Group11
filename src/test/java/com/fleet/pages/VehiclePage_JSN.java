package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage_JSN extends BasePage{

    public VehiclePage_JSN(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[20]")
    public WebElement masterCheckbox;

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[1]")
    public WebElement masterCheckboxArrow;

    @FindBy(xpath = "//a[text()='All']")
    public WebElement allButton;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> checkboxes;




}
