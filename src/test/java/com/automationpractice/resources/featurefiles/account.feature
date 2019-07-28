@registerPage
Feature: Register Feature
  As a user I want to navigate Register Page


  Scenario: User Should successfully Register and Login with registered email address
    Given I am on home page
    When I click on login link
    And I enter email address "mj" into email field
    And Click On Account Tab
    And I Click On Gender Button
    And I enter First Name "Manish"
    And I enter Last Name "Irachande"
    And I enter Password "12345678"
    And I enter Day Of Birth "7"
    And I enter Month of Birth "2"
    And I enter Year Of Birth "1991"
    And I click on News Letter Box
    And I enter Company Name "MMMMM"
    And I enter Address "124,Rugby Avenue"
    And I enter City Name "Wembley"
    And I enter State Name "14"
    And I enter Post Code "56666"
    And I enter Country Name "21"
    And I enter Mobile Number "656565"
    And I enter Second Address "121,Rugby Avenue"
    And I click On Register Tab
    Then I should should Register my account
    And I sign out from my account
    When I enter email address "mj" into email field on Login Page
    And I enter Password "12345678"
    And I click on Sign In tab
    Then I should login Successfully with same email




