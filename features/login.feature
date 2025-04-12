Feature: Login feature

  Background:
    Given open a browser
    And user open a saucedemo url


  @positive @smoke
  Scenario:  User able to login
    When  user enter "standard_user" in username field.
    And  user enter "secret_user" in password field.
    And  user click on login button.
    Then  Validate user successfully logged in to application

  @negative
  Scenario:  Verify error message after enter incorrect credentials
    When  user enter "" in username field.
    And  user enter "secret_user" in password field.
    And  user click on login button.
    Then  Validate error message display "Username is required"

  @negative
  Scenario: Verify error message after enter incorrect credentials
    When  user enter "standard_user" in username field.
    And  user enter "" in password field.
    And  user click on login button.
    Then  Validate error message display "Password is required"

  @nagative
  Scenario Outline:  verify error message after incorrect credentials
    When  user enter <username> in username field.
    And  user enter <password> in password field.
    And  user click on login button.
    Then  Validate error message display <error_message>

    Examples:
      | username      | password     | error_message        |
      |               | secret_sauce | Username is required |
      | standard_user |              | Password is required |




