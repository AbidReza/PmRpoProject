@ctest
Feature: Base Functionality For Export Wizard Page

  @positive @sanity
  Scenario:Login and verify Export Page Tab order
    Given user logged in TacoUI with "IM" credentials
    When user clicks ImplementaionMgmt icon
    Then user will land "im-tool" page
    Then user clicks Project Status dropdown
    Then select 'NotProcessed' project status
    Then user click import button
    Then user click browse button
    Then user click update button
    Then user clicks Production Drug dropdown
    Then select 'Product Name' from drug dropdown
    Then user clicks NDC from Drug dropdown
    Then select 'NDC11' NDC from drug dropdown
    Then user clicks Rx from drug dropdown
    Then select 'Rx Count' Rx from drug dropdown
    Then user click next button
    Then user should select device type dropdown
    Then select "Max 2 110/44/2=156" device option
    Then user select standard radio button
    Then user checked exclude drug button
    Then user checked exclude schedule button
    Then user checked exclude unit of usage button
    Then user checked exclude schedule button1
    Then user select unit of age radio button
    Then user click wizard import button
    Then click not available tab
    Then click Excluded tab
    Then click not oral solid tab
    Then click analysis tab
    Then click gnc button
    Then click check duplicate drugs
    Then click confirm button
    Then click cddb button
    Then user enters "FACE MASK" drug name into the search bar
    Then user checked drug name form list
    Then click add button
    Then click gnc button for export
    Then click export button
