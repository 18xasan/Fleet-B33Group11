package com.fleet.step_definitions;


import com.fleet.pages.LoginPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

   private WebDriver driver;
   private LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://qa.transmuda.com/");
        LoginPage LoginPage = new LoginPage(driver);
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        String username = null;
        String password = null;

        // Retrieve username and password based on user type
        if (userType.equalsIgnoreCase("driver")) {
            username = "user1";
            password = "UserUser123";
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = "salesmanager101";
            password = "UserUser123";
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = "storemanager51";
            password = "UserUser123";
        }
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

    }
}