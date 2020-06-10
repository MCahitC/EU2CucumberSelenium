package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I opened the browser then I navigated to vytrack login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);  //instead of driver object we will use Driver.get


    }

    @When("the user enters the driver credentials")
    public void the_user_enters_the_driver_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I input the driver credentials and press login button");
        LoginPage loginpage = new LoginPage();
        String username = ConfigurationReader.get("driver_Username");
        String password = ConfigurationReader.get("driver_Password");

        loginpage.Login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitFor(5);
        String actualtitle = Driver.get().getTitle();

        String expectedtitle = "Dashboard";

        Assert.assertEquals("verifying user is logged in",expectedtitle,actualtitle);
    }

    @When("the user enters the sales manager credentials")
    public void the_user_enters_the_sales_manager_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I entered the sales manager credentials");
        String username = ConfigurationReader.get("salesManager_username");
        String password = ConfigurationReader.get("salesManager_Password");

        LoginPage loginpage = new LoginPage();
        loginpage.Login(username,password);




    }

    @When("the user enters the store manager credentials")
    public void the_user_enters_the_store_manager_credentials() {
        String username = ConfigurationReader.get("storeManager_username");
        String password = ConfigurationReader.get("storeManager_Password");

        LoginPage loginpage = new LoginPage();
        loginpage.Login(username,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginpage = new LoginPage();
        loginpage.Login(username,password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String string) {
        BrowserUtils.waitFor(3);
        String actualtitle = Driver.get().getTitle();
       Assert.assertTrue("Actual title: "+actualtitle,Driver.get().getTitle().contains(string));

    }

}
