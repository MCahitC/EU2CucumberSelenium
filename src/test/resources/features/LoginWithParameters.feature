Feature: Login as different users

    # very critical information for cucumber, using the information on feature file on the java side
  Scenario: login as a user
    Given  the user is on the login page
    When  the user logs in using "user1" and "UserUser123"
    Then  the user should be able to login
    And the title contains "Dashboard"