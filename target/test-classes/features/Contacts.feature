Feature:  Contacts page


  Scenario: Default page number
    Given  the user is on the login page
    And the user enters the driver credentials
    When the user navigates "Customers" "Contacts"
    Then  default page number should be 1

    Scenario: Verify create calendar event
      Given the user is on the login page
      And the user enters the sales manager credentials
      When the user navigates "Activities" "Calendar Events"

  Scenario: Menu Options
    Given the user logged in as "driver"
    Then the user should see the following options
    |Fleet|
    |Customers|
    |Activities|
    |System|

  Scenario: Login as a given user
    Given the user is on the login page
    When the user logs in using the following credentials
      |username| user1|
      |password|UserUser123|
      |firstname| John     |
      |lastname | Doe      |
    Then the user should be able to login

  @wip
  Scenario Outline: Login as a given user
    Given the user is on the login page
    When the user logs in using the following credentials
      |username | <usertype>  |
      |password | UserUser123   |
      |firstname| <firstname> |
      |lastname | <lastname>  |
    Then the user should be able to login

    Examples:
    |usertype       | firstname | lastname |
    |user1          | John      | Doe      |
    |salesmanager101| Peyton    | Harber   |
    |storemanager85 | Marcella  | Huels    |