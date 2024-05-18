package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage_EJ {
    public CreateCalendarEventPage_EJ() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckbox;

    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(id = "tinymce")
    public WebElement descriptionBox;

    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement descriptionMessage ;



}



