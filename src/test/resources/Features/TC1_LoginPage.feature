@Login
Feature: Verifying Adactin Hotel Login Page

  Scenario Outline: Verify Adactin Login With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello RamaRamzy!"

    Examples: 
      | UserName   | Password   |
      | RamaRamzy  | 123456     |

  Scenario Outline: Verify Adactin Login With Valid Credentials With ENTER key
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>" With Help of ENTER key
    Then User Should Verify Welcome Message After Login "Hello RamaRamzy!"

    Examples: 
      | UserName   | Password   |
      | RamaRamzy  | 123456     |

  Scenario Outline: Verify Adactin Login With Invalid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Login Error Message Contains After Login "Invalid Login details or Your Password might have expired"

    Examples: 
      | UserName   | Password   |
      | RamaRamzy  | 123451     |
