Feature: Login Test
  As user I want to login into nop commerce website


  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email"nimesh@gmail.com"
    And I enter password"abc1234"
    And I click on login button
    Then I should login successfully




