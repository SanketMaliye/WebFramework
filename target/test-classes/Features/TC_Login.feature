Feature: User Login and Logout

  Scenario: Successful User Login and Logout
    Given the user is on the login page
    When the user clicks on the login button
    And the user enter correct email address and password     
    And the user clicks on the login button after entering the password
    And the user clicks on the logout link
    Then the user should be successfully logged out
    
  
  
 
 
