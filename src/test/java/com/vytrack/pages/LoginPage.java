package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
        //this method and class is used to initialise elements without having to use findElement
        //pagefactory is the class we use on selenium to allows us to create a page object midel design.
    }

   // @FindAll({

            //FindAlll annotation is similar to findelements method, so we can locate multiple
            //elements using FindBy annotations. the purpose is we can do two different locators
            // for the same elements and it will return the element if either OR is located.
   // })
   // @FindBys({

            /*
            FindBys annotations is the AND logic, so we can give more than one element locator
            and it will only return the element if all locators locate the element
            AND logic, whereas FindALL is OR logic.
             */
   // })


    @FindBy(id = "prependedInput")          //instead of findelement individually we use these methods for pom design
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;        //if we want to locate more than one element (findelements) then just change WebElement to List<WebElement>

    @FindBy(id = "_submit")
    public WebElement loginButn;


    public void Login(String Usernamestr , String Passwordstr){
        usernameInput.sendKeys(Usernamestr);
        passwordInput.sendKeys(Passwordstr);
        loginButn.click();

    }

    public void LoginDriver(){
        String usernamedrvr = ConfigurationReader.get("driver_Username");
        String passworddrvr = ConfigurationReader.get("driver_Password");
        usernameInput.sendKeys(usernamedrvr);
        passwordInput.sendKeys(passworddrvr);
        loginButn.click();

    }


}
