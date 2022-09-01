Feature: Base Functionality For Export Wizard Page

Background:
    Given user logged in TacoUI with "IM" credentials

  Scenario:Upload file and select mapping column
    When user clicks Project Status dropdown
    And select 'NotProcessed' project status for customer list
    And user click import button
    And user click browse button
    And user click update button

  Scenario:User mapped imported columns
    When user clicks Production Drug dropdown
    And select 'Product Name' from drug dropdown
    And user clicks NDC from Drug dropdown
    And select 'NDC11' NDC from drug dropdown
    And user clicks Rx from drug dropdown
    And select 'Rx Count' Rx from drug dropdown
    And user click next button

  Scenario:Choose what to exclude from the attached file
    Then user should select device type dropdown
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

  Scenario:Verify export wizard page all functionality works
    Then user click all tabs
    Then click gnc button
    Then user click to check duplicate drugs
    Then click confirm button
    Then click cddb button
    Then user enters "FACE" drug name into the search bar
    Then click pagination button
    Then user checked drug name form list
    Then click to add for drug list
    Then click ok button
    Then user checked drug name
    Then user clicked remove button
    Then user clicked remove confirm button
    Then user select again checked drug name
    Then user select cell location dropdown










