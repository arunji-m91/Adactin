@SearchPage
Feature: Verifying Adactin Hotel SearchHotel Page

  Scenario Outline: Search Hotel Page with only Mandatory Field
    Given User is in Adactin Hotel Login Page
    When User enter valid "<username>" and "<password>"
    And User Click the Login button
    And User should enter "<Location>","<numberOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    And User should click Search Button
    Then User should verify SearchHotel Success message "Select Hotel"

    Examples: 
      | username   | password | Location | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Greens8767 | L4R739   | London   | 2 - Two       | 16/12/2022  | 17/12/2022   | 1 - One       |
