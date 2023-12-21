Feature: As a user I want to verify different login functions.

  Background:
    Given I am on HomePage & Login to the application

  @sanity @regression
  Scenario: I should login successfully
    Then I see Welcome message

  @smoke @regression
  Scenario: I should see Logo
    Then I see the Orange HRM Logo

  @regression
  Scenario: I should log out successfully
    When I click on user profile logo
    And I mouse hover and click on logout
    Then I am logged out and see text Login Panel
