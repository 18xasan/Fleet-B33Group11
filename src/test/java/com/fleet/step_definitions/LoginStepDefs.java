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
    public static void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("user1");
            password = ConfigurationReader.getProperty("UserUser123");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("salesmanager101");
            password = ConfigurationReader.getProperty("UserUser123");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("storemanager51");
            password = ConfigurationReader.getProperty("UserUser123");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }





}