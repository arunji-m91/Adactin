@Login
Feature: Verify the Login Functionality of Sbi Online Portal

  Scenario: Verifying the Sbi login text box visible or not
    Given User is in Sbi Online Portal
    When User click the button continue and user switched into the login page
    Then User should verify username password login and reset block is visible

  Scenario Outline: Login with invalid credentials
    Given User is in Sbi Online Portal
    When User click the button continue and user switched into the login page
    When User enter invalid "<username>" and "<password>"
    And User Click the Login button
    Then User should verify the Login is Error message contains "Please enter the text as shown in the image"

    Examples: 
      | username | password |
      | xxxxxxx  | L4R739   |
