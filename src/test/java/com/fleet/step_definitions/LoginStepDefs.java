package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;
        assert userType != null : "User type is null";
        switch (userType.toLowerCase()) {
            case "driver":
                username = ConfigurationReader.getProperty("driver_username");
                password = ConfigurationReader.getProperty("driver_password");
                break;
            case "sales manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                password = ConfigurationReader.getProperty("sales_manager_password");
                break;
            case "store manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                password = ConfigurationReader.getProperty("store_manager_password");
                break;
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
        assert username != null : "Username is null";
        assert password != null : "Password is null";
        //send username and password and login
        new LoginPage().login(username, password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        assert username != null : "Username is null";
        assert password != null : "Password is null";
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }
}