
Feature: Verifying Adactin Hotel Cancel page

  Scenario Outline: Verify Adactin Hotel Cancelling Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello RamaRamzy!"
    And User Should Fill & Submit All Feilds In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NoOfRoom>","<Check-in>","<Check-out>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User Should Select Hotel
    Then User Should Verify Message After Select "Book A Hotel"
    And User Should Book Hotel "<FirstName>","<LastName>","<Address>" and Save Generated Order ID
      | CreditCardType   | CreditCardNo     | Month | Year | CCVNo |
      | American Express | 1234567887654321 |    12 | 2022 |   321 |
      | Visa             | 1234567887654321 |    12 | 2022 |   321 |
      | Master           | 1234567887654321 |    12 | 2022 |   321 |
    Then User Should Verify Message After Booking "Booking Confirmation"
    And User Should Cancel The Order Id
    Then User Should Verify Message After Cancelling "The booking has been cancelled."

    Examples: 
      | UserName  | Password | Location | Hotels      | RoomType | NoOfRoom | Check-in   | Check-out  | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | Address |
      | RamaRamzy |   123456 | London   | Hotel Creek | Standard | 1 - One  | 21/06/2022 | 23/06/2022 | 2 - Two       | 1 - One         | dinesh    | c        | chennai |
@cancel
  Scenario Outline: Verify Adactin Hotel Cancelling Page With Valid Credentials
    Given User is on the Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello RamaRamzy!"
    And User Should Cancel The Previously Booked Order Id "<OrderId>"
    Then User Should Verify Message After Cancelling "The booking has been cancelled."

    Examples: 
      | UserName  | Password | OrderId    |
      | RamaRamzy |   123456 | D91T24A1AH |
