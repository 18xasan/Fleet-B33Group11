package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersAllAccountsPage {

    public CustomersAllAccountsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customersLink;

    @FindBy(xpath = "(//span[.='Accounts'])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filtersLink;

    @FindBy(xpath = "(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]")
    public WebElement filter_one_account_name;

    @FindBy(xpath = "//a[text()='Manage filters']")
    public WebElement manageFilterButton;

    @FindBy(xpath = "//label[@title='Account name']")
    public WebElement checkboxAccountName;

    @FindBy(xpath = "//label[@title='Contact name']")
    public WebElement checkboxContactName;

    @FindBy(xpath = "//label[@title='Contact email']")
    public WebElement checkboxContactEmail;

    @FindBy(xpath = "//label[@title='Contact phone']")
    public WebElement checkboxContactPhone;

    @FindBy(xpath = "//label[@title='Owner']")
    public WebElement checkboxOwner;

    @FindBy(xpath = "//label[@title='Business Unit']")
    public WebElement checkboxBusinessUnit;

    @FindBy(xpath = "//label[@title='Created At']")
    public WebElement checkboxCreatedAt;

    @FindBy(xpath = "//label[@title='Updated At']")
    public WebElement checkboxUpdatedAt;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']")
    public WebElement menageFilterCheckBox;


}
