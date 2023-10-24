Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given login page browser is open
    And user is on the login page
    When user enters login <username> and <password>
    And user clicks on login
    Then the user is navigated to the home page and then logout
    
     Examples: 
      | username        |    password     |
      | standard_user   |    secret_sauce |
      | problem_user    |    secret_sauce |
   