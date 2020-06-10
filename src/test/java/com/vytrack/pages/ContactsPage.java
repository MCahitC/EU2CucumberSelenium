package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends com.vytrack.pages.BasePage {

    public ContactsPage(){
        PageFactory.initElements(Driver.get(),this);
        //since we are extending base page we dont actually need to re write this code for pom model
    }

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

   // @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
   // public WebElement email;
    // using the method below we can dynamically get the web element we want for diffrent emails if we need to
    public WebElement getContactEmail(String email){
        String xpath = "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));

    }
}
