@android
Feature: Testing Calculator

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  Scenario: User doing addition on 2 numbers
    Given default operator on calculator set to addition
    And user input first number is "50"
    And user input second number is "50"
    When user click equal button
    Then the result is 100

  Scenario: User doing multiply on 2 numbers
    Given user change operator to multiply
    And user input first number is "8"
    And user input second number is "7"
    When user click equal button
    Then the result is 56

  Scenario: User doing division on 2 numbers
    Given user change operator to divide
    And user input first number is "100"
    And user input second number is "5"
    When user click equal button
    Then the result is 20

  Scenario: User doing subtraction on 2 numbers
    Given user change operator to minus
    And user input first number is "15000"
    And user input second number is "5000"
    When user click equal button
    Then the result is 10000

