package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesCostsPage_KY {


    public VehiclesCostsPage_KY() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "grid-header-cell__label")
    public List<WebElement> columnNames;


    @FindBy(xpath = "    (//input[@type='checkbox'])[4]")
    public WebElement checkboxSelectAll;

    @FindBy(xpath = " //input[@data-role='select-row-cell']")
    public List<WebElement> checkboxes;


}
