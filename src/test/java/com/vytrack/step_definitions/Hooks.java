package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("This is done before each scenario");
    }
    @After
    public  void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            final byte[] screensot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screensot,"image/png","screenshot");
        }


        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDb(){
        System.out.println("Connecting to datatbase");
    }
    @After("@db")
    public  void tearDownDb(){
        System.out.println("terminating connection to database");
    }
}
