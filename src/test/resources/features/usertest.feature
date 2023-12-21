Feature: As a user I want to verify admin can execute different actions on users.

  Background:
    Given I am on HomePage & Login to the application

  @sanity @regression
  Scenario: Admin should be able to add users
    When I click On Admin Tab
    Then I Verify System Users Text
    When I click On Add button
    Then I Verify Add User Text
    When I Select User Role Admin
    And I enter Employee Name Paras Sana
    And I enter User name
    And I Select status Disable
    And I enter password
    And I enter Confirm Password
    And I click On Save Button
    Then I verify message Successfully Saved

  @smoke @regression
  Scenario: Admin should be able to search the user created and verify it.

    When I click On Admin Tab
    Then I Verify System Users Text
    When I Enter username
    And I Select user role
    And I select status
    And I click on search
    Then I should see the user in the list

  @regression
  Scenario: Admin should be able to delete the user record.
    When I click On Admin Tab
    Then I Verify System Users Text
    When I click On Add button
    Then I Verify Add User Text
    When I Select User Role Admin
    And I enter Employee Name Paras Sana
    And I enter User name
    And I select status enable
    And I enter password
    And I enter Confirm Password
    And I click On Save Button
    And I search for user
    And I select user role
    And I select the status
    And I click on Search
    And I click on check box
    And I click delete
    And I click ok on pop up
    Then I should see message Successfully Deleted

  @regression
  Scenario: I want to search for deleted record to ensure it is not found.
    When I click On Admin Tab
    Then I Verify System Users Text
    When I search for user
    And I select user role
    And I select its status
    And I click search
    Then I see message No Record Found