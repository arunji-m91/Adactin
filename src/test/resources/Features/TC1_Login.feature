Feature: Verify the Login Functionality of Adactin Hotel

  Scenario Outline: Login with valid credentials
    Given User is in Adactin Hotel Login Page
    When User enter valid "<username>" and "<password>"
    And User Click the Login button
    Then User should verify the Login Success message contains "<username>"

    Examples: 
      | username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Login with invalid credentials
    Given User is in Adactin Hotel Login Page
    When User enter valid "<username>" and "<password>"
    And User Click the Login button
    Then User should verify the Login is Error message contains "Invalid"

    Examples: 
      | username | password |
      | xxxxxxx  | L4R739   |
