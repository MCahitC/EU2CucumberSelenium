@navigate
Feature: Sales managers should be able to navigate pages using the top menu

  Scenario: Navigate to fleet then vehicles
    Given the user is on the login page
    When the user enters the sales manager credentials and logs in
    Then the user should be able to navigate to fleet then vehicles
    Then the user is on the vehicles page
    @db
    Scenario: Navigate to Marketing then Campaigns
      Given the user is on the login page
      When  the user enters the sales manager credentials and logs in
      Then  the user can navigate to Marketing then Campaigns
      Then  user is on the Campaigns page

      Scenario: Navigate to Activities then calendar events
        Given the user is on the login page
        When the user enters the sales manager credentials and logs in
        Then the user should be able to navigate to Activities then calendar events
        Then user is on the Calendar events page