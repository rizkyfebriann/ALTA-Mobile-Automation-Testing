@android
Feature: Testing List Menu

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do scroll

  Scenario: Press list ke-59 button for few seconds
    Given user see list ke-59 button
    And user press list ke-59 button for few seconds
    Then list ke-59 button must be pressed

  Scenario: Tap multiple times on list ke-60 button
    Given user see list ke-60 button
    And user tap multiple times on list ke-60 button
    Then user see notification list ke-60 on bottom