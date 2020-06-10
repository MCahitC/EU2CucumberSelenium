package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage extends com.vytrack.pages.BasePage {

    @FindBy(css = "h1.user-name")
    public WebElement fullname;

    @FindBy(xpath = "//a[@class='email']")
    public  WebElement email;

    @FindBy(css = "a.phone")
    public WebElement phone;




}
