Feature: Register

  Scenario : User should create account successfully
    Given I am on homepage
    When I click on register link
    And I click on Male tab
    And I enter First name "Nimesh"
    And I enter Last name "Gajjar"
    And I selcet Day "16"
    And I select Month "April"
    And I select Year "1978"
    And I enter Email "Nimesh@gmail.com"
    And I enter Company name "Delta"
    And I click on Newsletter
    And I enter Password "RadheShyam@99"
    And I enter Confirm "RadheShyam@99"
    Then registration successful
