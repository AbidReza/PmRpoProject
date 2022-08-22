@atest
Feature: Base Functionality for Implementation Manager

  Background:
    Given user logged in TacoUI with "IM" credentials
    When user click ImplementaionMgmt icon
    Then user will land "im-tool" page

  Scenario:Selected Project Status Should Be Reflect In customer list area
    When user clicks Project Status dropdown
    And select 'NotProcessed' project status for customer list
    Then user should see customer list








 

