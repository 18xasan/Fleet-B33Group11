package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage {

    public CalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@class='unclickable'])[3]")
    public WebElement activitiesButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a")
    public WebElement calendarEventsButton;

    @FindBy(xpath = "//*[contains(@class, 'btn main-group btn-primary pull-right')]")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//*[@id='recurrence-repeat-view4655']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement repeatEveryRadioBox;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement repeatEveryInputBox;

    @FindBy(xpath = "(//span[.='The value have not to be less than 1.'])[1]")
    public WebElement negativeNumberErrorMessage;

    @FindBy(xpath = "(//span[.='The value have not to be more than 99.'])[1]")
    public WebElement over99NumberErrorMessage;


}
