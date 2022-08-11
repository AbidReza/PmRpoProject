@ctest
Feature: Base Functionality For Export Wizard Page

  @positive @sanity
  Scenario:Login and verify Export Page Tab order
    Given user logged in TacoUI with "IM" credentials
    When user clicks ImplementaionMgmt icon
    Then user will land "im-tool" page
    