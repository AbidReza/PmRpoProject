@ctest
Feature: Base Functionality For Export Wizard Page

  @positive @sanity
  Scenario:Login and verify Export Page Tab order
    Given user logged in TacoUI with "IM" credentials
    When user clicks ImplementaionMgmt icon
    Then user will land "im-tool" page
    Then user will land the "https://frontend.stg.tacodevdomain.com/im-tool/export/6a5f46d4-86ac-4e09-8587-eaee9e9db434" page