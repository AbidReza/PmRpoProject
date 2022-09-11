Feature: Base Functionality For Export Wizard Page

Background:
    Given user logged in TacoUI with "IM" credentials

  Scenario:Verify project management tool page
    When user clicks Project Status dropdown
    And select 'NotProcessed' project status for customer list
    Then user should see customer list

  Scenario:Import wizard page for upload csv file
    When user click import button
    And user click browse button
    And user click update button
    Then user should see successful uploaded message

  Scenario:Verify import page for map imported columns
    When user clicks Production Drug dropdown
    And select 'Product Name' from drug dropdown
    And user clicks NDC from Drug dropdown
    And select 'NDC11' NDC from drug dropdown
    And user clicks Rx from drug dropdown
    And select 'Rx Count' Rx from drug dropdown
    And user checked no usage
    And user click next button
    Then user should see import wizard document page

  Scenario:Verify import wizard document page
    When user select device type dropdown
    And select "Max 2" device option
    And user checked exclude button
    And user checked exclude unit of usage button
    And user click Analyze button
    Then user will see cell recommendation section

  Scenario:Verify Cell recommendation section
    When user select sub device type dropdown
    And user select "Max 2 – Lite" sub device option
    And user click wizard import button
    Then user should see the export page

  Scenario:Verify metro health valley view page
    When user click all tabs
    Then user should see all tab list

  Scenario:Verify Similar GCN found for multiple drugs
    When click gnc button
    And click highest usage drugs button
    And click confirm button
    Then user should see duplicate NDC sorted Successful message

  Scenario:Verify CDDB  for multiple drugs
    When click cdb button
    And user enters "COL" drug name into the search bar
    And click pagination button
    And user checked drug name form list
    And click to add for drug list
    And click ok button
    Then user will go back to export page

  Scenario:Verify check drug name
    When user checked drug name
    Then user clicked remove button
    Then user clicked remove confirm button
    Then user select again checked drug name
    Then user select cell location dropdown
    And  user select "V9-Super" option
    And user click export XLSX dropdown
    And user select "Export XLSX-" options
    And user clicked export confirm button
    Then user will see a csv file is downloaded

  Scenario:User log out
    When click log out dropdown
    And user clicked log out button
    Then user will see main page













