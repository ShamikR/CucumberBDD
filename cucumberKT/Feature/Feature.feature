#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: Test FaceBook Login
    Given I Open FaceBook Page In browser
    When I provide "<USERNAME>" and "<PASSWORD>"
    Then I verify the page title is "<TITLE>"

    Examples: 
      | USERNAME | PASSWORD | TITLE  |
      | rayshamik@gmail.com |     password1 | Facebook_title |
      | rayshamik1@gmail.com |    password2 | login_failure  |
 