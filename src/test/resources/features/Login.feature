
Feature: Login functionality

  Scenario Outline: User should be able to login with valid credentials
    Given Navigate to home page
    When Enter valid "<email>" and "<password>"
    And Proceed to captcha and click login button
    Then Verify that user is on the home page
    Examples:
       |email                     |password  |
       |berkertoklac@hotmail.com  |Bt12449948|

  Scenario Outline: User should not be able to login with invalid credentials
    Given Navigate to home page
    When Enter invalid "<email>" and "<password>"
    And Proceed to captcha and click login button
    Then Verify that user can not login
    Examples:

      |email                                        |password   |
      |berkertoklac12312@hotmail.com                |1234567    |


  Scenario Outline: User should be able to see 'This field is required' warning when name is blanked
    Given Navigate to home page
    When Click the "<email>" field and leave it blank
    And Enter the "<password>" empty field
    And Proceed to captcha and click login button
    Then Verify that warning is seen under email tab
    Examples:

    |email    |password   |
    |         |123456     |

  Scenario Outline: User should be able to see 'This field is required' warning when password is blanked
    Given Navigate to home page
    When Sends a space String to the "<password>" button
    And Enter the "<email>" field
    And Proceed to captcha and click login button
    Then Verify that warning is seen under password tab
    Examples:

    |email                   |password |
    |berkertoklac@hotmail.com|         |

 Scenario: User should be able to get a new password by using 'ForgetMyPassword' bar
    Given Navigate to home page
    When Click ForgetMyPassword bar
    And Send a valid email as "berkertoklac@hotmail.com" and verify captcha step
    And Click send button
    Then Verify that email is successfully sent