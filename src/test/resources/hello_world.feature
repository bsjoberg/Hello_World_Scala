Feature: Hello world

  Scenario: Make sure my dev environment is working
    Given I have a hello world app
    When I say hi
    Then I hear "Hello World"