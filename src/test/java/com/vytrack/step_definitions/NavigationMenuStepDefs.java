package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user enters the sales manager credentials and logs in")
    public void the_user_enters_the_sales_manager_credentials_and_logs_in() {
        System.out.println("enter sales manager credentials and click login ");
    }

    @Then("the user should be able to navigate to fleet then vehicles")
    public void the_user_should_be_able_to_navigate_to_fleet_then_vehicles() {
        System.out.println("navigating to module on the top menu Fleet---Vehicles");
    }

    @Then("the user is on the vehicles page")
    public void the_user_is_on_the_vehicles_page() {
        System.out.println("Verify the title is Vehicles");
    }

    @Then("the user can navigate to Marketing then Campaigns")
    public void the_user_can_navigate_to_Marketing_then_Campaigns() {
        System.out.println("Navigating to module on top menu, Marketing---Campaigns");
    }

    @Then("user is on the Campaigns page")
    public void user_is_on_the_Campaigns_page() {
        System.out.println("Verify the tile is Campaigns");
    }

    @Then("the user should be able to navigate to Activities then calendar events")
    public void the_user_should_be_able_to_navigate_to_Activities_then_calendar_events() {
        System.out.println("Navigating to module on top menu, Activities, Calendar Events");
    }

    @Then("user is on the Calendar events page")
    public void user_is_on_the_Calendar_events_page() {
        System.out.println("Verifying the title is Calendar Events");
    }

    @When("the user navigates {string} {string}")
    public void the_user_navigates(String string, String string2) {
        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(string,string2);


    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer int1) {
        BrowserUtils.waitFor(3);
        ContactsPage contactspage = new ContactsPage();
        Integer actualnumber = Integer.parseInt(contactspage.pageNumber.getAttribute("value"));

        Assert.assertEquals("verifying default page number ",int1,actualnumber);
    }


}
