Feature: Check login functionality

  @smoke
  Scenario: 
    Given user is on login page in HooksDemoSteps
    When user enters username and password in HooksDemoSteps
    And clicks on login button in HooksDemoSteps
    Then user is navigated to the home page in HooksDemoSteps

  Scenario: 
    Given user is on login page in HooksDemoSteps
    When user enters username and password in HooksDemoSteps
    And clicks on login button in HooksDemoSteps
    Then user is navigated to the home page in HooksDemoSteps
