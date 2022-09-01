package com.parata.steps;

import com.parata.base.AutomationBase;
import com.parata.pages.ImplementationMPage;
import com.parata.pages.ExportPage;

import com.parata.pages.ImportWizerdMapImportedPage;
import com.parata.utils.SmartWait;
import com.parata.utils.Utility;
import com.parata.utils.context.TestContext;
import com.parata.steps.ImplementationMPageSteps;
import com.parata.steps.ExportPageSteps;
import com.parata.pages.ExportPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;

public class ImportWizerdMapImportedSteps extends AutomationBase {
    ImportWizerdMapImportedPage importWizerdMapImportedPage = new ImportWizerdMapImportedPage(openDriver());
    ImplementationMPageSteps  implementationMPageStep;
    ExportPageSteps exportPageSteps;
    ExportPage exportPage = new ExportPage(openDriver());

    public ImportWizerdMapImportedSteps(TestContext testContext)
    {
        implementationMPageStep = new ImplementationMPageSteps(testContext);
        exportPageSteps = new ExportPageSteps(testContext);
    }

    SmartWait smartWait = new SmartWait();

    @When("user click import button")
    public void clickImportButton() throws InterruptedException{

        implementationMPageStep.userClicksAllRolesDropdown();
        implementationMPageStep.selectRole("NotProcessed");
        implementationMPageStep.userShouldSeeCustomerList();
        importWizerdMapImportedPage.userclickedImportButton();
        smartWait.waitUntilPageIsLoaded(30);
        System.out.println("User clicked import button");
    }

    @And("user click browse button")
    public void clickBrowseButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedBrowseButton();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @And("user click update button")
    public void clickUploadButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedUploadButton();
        smartWait.waitUntilPageIsLoaded(90);
    }

    @Then("user should see successful uploaded message")
    public void userShouldSeeSuccessfulUploadedMessage() throws InterruptedException {
        String text = importWizerdMapImportedPage.userSeeSuccessfullyMessage();
        Assert.assertEquals(text, "File Successfully Uploaded!");
        smartWait.waitUntilPageIsLoaded(90);
    }

    @When("user clicks Production Drug dropdown")
    public void userClicksDrugMapDropdown1() throws InterruptedException {
        implementationMPageStep.userClicksAllRolesDropdown();
        implementationMPageStep.selectRole("NotProcessed");
//        implementationMPageStep.userShouldSeeCustomerList();
        clickImportButton();
        clickBrowseButton();
        clickUploadButton();
        importWizerdMapImportedPage.userselectMapDropdown1();
        smartWait.waitUntilPageIsLoaded(20);
    }


    @And("select {string} from drug dropdown")
    public void selectDrugProducName(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectBtnProductDragName();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("user clicks NDC from Drug dropdown")
    public void userClicksDrugMapDropdown2() throws InterruptedException {
        importWizerdMapImportedPage.userselectMapDropdown2();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("select {string} NDC from drug dropdown")
    public void selectDrugNdcName(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectBtnNdcDragName();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user clicks Rx from drug dropdown")
    public void userClicksDrugMapDropdown3() throws InterruptedException {
        importWizerdMapImportedPage.userselectMapDropdown3();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("select {string} Rx from drug dropdown")
    public void selectDrugRxName(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectBtnRxDragName();
        smartWait.waitUntilPageIsLoaded(10);
    }


    @Then("user click next button")
    public void userClicksNextButton() throws InterruptedException {
        importWizerdMapImportedPage.userclickedNextButton();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("user should see import wizard document page")
    public void user_should_see_import_wizard_page() throws InterruptedException {

    }

    @Then("user select device type dropdown")
    public void userSelectDeviceType() throws InterruptedException {

        implementationMPageStep.userClicksAllRolesDropdown();
        implementationMPageStep.selectRole("NotProcessed");
        clickImportButton();
        clickBrowseButton();
        clickUploadButton();
        importWizerdMapImportedPage.userselectMapDropdown1();
        selectDrugProducName("Product Name");
        userClicksDrugMapDropdown2();
        selectDrugNdcName("NDC11");
        userClicksDrugMapDropdown3();
        selectDrugRxName("Rx Count");
        userClicksNextButton();
        importWizerdMapImportedPage.selectDeviceType();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("select {string} device option")
    public void selectDeviceOption1(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectOption1();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user select standard radio button")
    public void userSelectStandardRadioButton() throws InterruptedException {
        importWizerdMapImportedPage.btnRadioStandrad();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked exclude button")
    public void userCheckdExcludeDrugButton() throws InterruptedException {
        importWizerdMapImportedPage.chkExcludeDrug();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked exclude schedule button")
    public void userCheckdExcludeScheduleButton() throws InterruptedException {
        importWizerdMapImportedPage.chkExcludeSchedule();
        smartWait.waitUntilPageIsLoaded(15);
    }


    @Then("user checked exclude schedule button1")
    public void userCheckdExcludeScheduleButton1() throws InterruptedException {
        importWizerdMapImportedPage.chkExcludeSchedule1();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked exclude drug button")
    public void userCheckdExcludeDrugButton2() throws InterruptedException {
        importWizerdMapImportedPage.chkExcludeDrug2();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked exclude unit of usage button")
    public void userCheckedExcludeUsage() throws InterruptedException {
        importWizerdMapImportedPage.chkExcludeUsage();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked antineoplastic button")
    public void userCheckedAntineoplastic() throws InterruptedException {
        importWizerdMapImportedPage.chkAntineoPlastic();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user click Analyze button")
    public void clickAnalyzeButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedAnalyzeButton();
        smartWait.waitUntilPageIsLoaded(60);
    }


    @Then("user should select sub device type dropdown")
    public void userShouldSelectSubDeviceType() throws InterruptedException {
        importWizerdMapImportedPage.selectSubDeviceType();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("user select {string} sub device option")
    public void selectSubDeviceOption(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectSubDeviceOption();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user click wizard import button")
    public void clickWizardImportButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedWizardImportButton();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user got to export page")
    public void usergottoexportpage() throws InterruptedException {

    }

//    @Then("user click all tabs")
//    public void clickNotAvailabletab() throws InterruptedException{
//        implementationMPageStep.userClicksAllRolesDropdown();
//        implementationMPageStep.selectRole("NotProcessed");
//        clickImportButton();
//        clickBrowseButton();
//        clickUploadButton();
//        importWizerdMapImportedPage.userselectMapDropdown1();
//        selectDrugProducName("Product Name");
//        userClicksDrugMapDropdown2();
//        selectDrugNdcName("NDC11");
//        userClicksDrugMapDropdown3();
//        selectDrugRxName("Rx Count");
//        userClicksNextButton();
/////////////////////////////////////////////////////////////////////////
//        importWizerdMapImportedPage.selectDeviceType();
//        clickGncButton();
//        checkDuplicateDrug();
//        clickedConfirmButton();
//        clickedCddbButton();
//        searchDrugName("FACE");
//        clickedPaginationButton();
//        checkDrugNameList();
//        clickedAddButton();
//        clickedOkButton();
//        checkDrugName();
//        userClickRemoveButton();
//        userClickRemoveConfirmButton();
//        userSelectAgainCheckedDrugName();
//        userClickCellLocationDropdown();
//        userClickCellLocationOption();
//        clickPenButton();
//        exportPage.userclickedAllTab();
//        smartWait.waitUntilPageIsLoaded(30);
//    }
//
//    @Then("click gnc button")
//    public void clickGncButton() throws InterruptedException{
//        exportPage.userClickedGcnLink();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user click to check duplicate drugs")
//    public void checkDuplicateDrug() throws InterruptedException{
//        exportPage.userCheckedDuplicate();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("click confirm button")
//    public void clickedConfirmButton() throws InterruptedException{
//        exportPage.userClickedConfirmButton();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("click cddb button")
//    public void clickedCddbButton() throws InterruptedException{
//        exportPage.userClickedCddbButton();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user enters {string} drug name into the search bar")
//    public void searchDrugName(String drugName) {
//        exportPage.enterSearchDrugName(drugName);
//        smartWait.waitUntilPageIsLoaded(20);
//    }
//    @Then("click pagination button")
//    public void clickedPaginationButton() throws InterruptedException{
//        exportPage.clickPagination();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user checked drug name form list")
//    public void checkDrugNameList() throws InterruptedException{
//        exportPage.userCheckDrugList();
//        smartWait.waitUntilPageIsLoaded(20);
//    }
//
//    @Then("click to add for drug list")
//    public void clickedAddButton() throws InterruptedException{
//        exportPage.userClickedBtnAdd();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("click ok button")
//    public void clickedOkButton() throws InterruptedException{
//        exportPage.userClickedBtnOk();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user checked drug name")
//    public void checkDrugName() throws InterruptedException{
//        exportPage.userCheckedDrugName();
//        smartWait.waitUntilPageIsLoaded(20);
//    }
//
//    @Then("user clicked remove button")
//    public void userClickRemoveButton() throws InterruptedException{
//        exportPage.userClickedBtnRemove();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user clicked remove confirm button")
//    public void userClickRemoveConfirmButton() throws InterruptedException{
//        exportPage.userClickedBtnRemoveConfirm();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user select again checked drug name")
//    public void userSelectAgainCheckedDrugName() throws InterruptedException{
//        exportPage.userCheckedDrugNameAgain();
//        smartWait.waitUntilPageIsLoaded(20);
//    }
//
//    @Then("user select cell location dropdown")
//    public void userClickCellLocationDropdown() throws InterruptedException{
//        exportPage.userSelectCellLocationDropdown();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user select cell location option")
//    public void userClickCellLocationOption() throws InterruptedException{
//        exportPage.userSelectCallLocationDropDownOption();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("click pen option")
//    public void clickPenButton() throws InterruptedException{
//        exportPage.userClickedBtnPenOption();
//        smartWait.waitUntilPageIsLoaded(15);
//    }

}
