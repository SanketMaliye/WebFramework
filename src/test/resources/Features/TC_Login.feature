Feature: User Login and Logout

  Scenario: Successful User Login and Logout
    Given the user is on the login page
    When the user clicks on the login button
    And the user enters their email
    And the user clicks on the continue button
    And the user enters their password
    And the user clicks on the continue button after entering the password
    And the user clicks on the profile dropdown
    And the user clicks on the logout link
    Then the user should be successfully logged out
