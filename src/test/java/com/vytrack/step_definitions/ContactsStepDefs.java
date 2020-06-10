package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.PushbackReader;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        //go to login page
        //log in based on given string

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equals("driver")){
            username=ConfigurationReader.get("driver_Username");
            password=ConfigurationReader.get("driver_Password");
        }else if (userType.equals("sales manager")){
            username=ConfigurationReader.get("salesManager_username");
            password=ConfigurationReader.get("salesManager_Password");
        }else if (userType.equals("store manager")){
            username=ConfigurationReader.get("storeManager_username");
            password=ConfigurationReader.get("storeManager_Password");
        }

        new LoginPage().Login(username,password);


    }

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> menuOptions) {

            BrowserUtils.waitFor(3);

        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);


        Assert.assertEquals("verifying the menu options", menuOptions, actualOptions);

        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptions = " + menuOptions);



    }

    @When("the user logs in using the following credentials")
    public void the_user_logs_in_using_the_following_credentials(Map<String,String> userInfo) {
        System.out.println("userInfo = " + userInfo);

        new LoginPage().Login(userInfo.get("username"),userInfo.get("password"));

        String expectedName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        String actualName=new DashboardPage().getUserName();

        Assert.assertEquals(expectedName,actualName);

        System.out.println("actualname = " + actualName);
        System.out.println("expectedname = " + expectedName);



    }
}
