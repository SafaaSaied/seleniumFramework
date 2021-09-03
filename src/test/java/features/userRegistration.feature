    Feature: User Registration
    I want to check that the user can register

    Scenario Outline: user Registration
    Given the user in the home page
    When  the user clicks on register link
    And  he entered his "<firstname>","<lastname>","<email>" ,"<companyname>","<password>","<day>","<month>","<year>"
    Then  the registration page displayed successfully
    
    
   Examples:
   | firstname | lastname | email | companyname | password | day | month | year |
   | safaa | saied | safaaaass@gmaill.com | xx | 12345678 | 15 | March | 1993  |
   | ahmed | mohamed | ahmed@hmailll.com | yyy | 123456789 | 1 | June | 1980  |