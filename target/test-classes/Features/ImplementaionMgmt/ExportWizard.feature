Feature: Base Functionality For Export Wizard Page

Background:
    Given user logged in TacoUI with "IM" credentials

  Scenario:Upload file and select mapping column
    When user clicks Project Status dropdown
    And select 'NotProcessed' project status for customer list
    Then user should see customer list

  Scenario:Import wizard page to upload csv file
    When user click import button
    And user click browse button
    And user click update button
    Then user should see successful uploaded message

  Scenario:User mapped imported columns
    When user clicks Production Drug dropdown
    And select 'Product Name' from drug dropdown
    And user clicks NDC from Drug dropdown
    And select 'NDC11' NDC from drug dropdown
    And user clicks Rx from drug dropdown
    And select 'Rx Count' Rx from drug dropdown
    And user click next button
    Then user should see import wizard document page

  Scenario:Choose what to exclude from the attached file
    When user select device type dropdown
    And select "Max 2" device option
    And user checked exclude button
    And user checked exclude schedule button
    And user checked exclude schedule button1
    And user checked exclude drug button
    And user checked exclude unit of usage button
    And user checked antineoplastic button
    And user click Analyze button
    And user should select sub device type dropdown
    And user select "Full Manifold" sub device option
    And user click wizard import button
    Then user got to export page











