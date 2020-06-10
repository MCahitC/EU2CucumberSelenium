@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page
    #common steps

  @driver @VYT_123
  Scenario: Login as a driver
    When  the user enters the driver credentials
    Then  the user should be able to login


    #In the features directory we keep features. These are test scenarios and test steps we write in gherkin language.
  @sales_manager @VYT_123
  Scenario: Login as a sales manager
    When  the user enters the sales manager credentials
    Then  the user should be able to login

  @store_manager
  Scenario: Login as a store manager
    When the user enters the store manager credentials
    Then the user should be able to login


