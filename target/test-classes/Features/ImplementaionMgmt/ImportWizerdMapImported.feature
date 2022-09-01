Feature: Base Functionality For Import Wizard Mapping
  Background:
    Given user logged in TacoUI with "IM" credentials


  @positive @sanity
  Scenario:Selected Project Status Should Be Reflect In customer list area
    When user clicks Project Status dropdown
    And select 'NotProcessed' project status for customer list

  @positive @sanity
  Scenario: Upload file and select mapping column
    When user click import button
    And user click browse button
    And user click update button


  @positive @sanity
  Scenario: User mapped imported columns
    When user clicks Production Drug dropdown
    And select 'Product Name' from drug dropdown
    And user clicks NDC from Drug dropdown
    And select 'NDC11' NDC from drug dropdown
    And user clicks Rx from drug dropdown
    And select 'Rx Count' Rx from drug dropdown
    And user click next button



