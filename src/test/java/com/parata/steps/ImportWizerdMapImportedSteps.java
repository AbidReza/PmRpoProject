package com.parata.steps;

import com.parata.base.AutomationBase;
import com.parata.pages.ImplementationMPage;
import com.parata.pages.ImportWizerdMapImportedPage;
import com.parata.utils.SmartWait;
import com.parata.utils.Utility;
import com.parata.utils.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;

public class ImportWizerdMapImportedSteps extends AutomationBase {
    ImportWizerdMapImportedPage importWizerdMapImportedPage = new ImportWizerdMapImportedPage(openDriver());
    SmartWait smartWait = new SmartWait();

    @Then("user click import button")
    public void clickImportButton() throws InterruptedException{

        importWizerdMapImportedPage.userclickedImportButton();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @Then("user click browse button")
    public void clickBrowseButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedBrowseButton();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @When("user click update button")
    public void clickUploadButton() throws InterruptedException{
        importWizerdMapImportedPage.userclickedUploadButton();
        smartWait.waitUntilPageIsLoaded(90);
    }

    @Then("user should receive file successfully uploaded message")
    public void userShouldReceiveSuccessfullyUpload() throws InterruptedException {

    }

    @Then("user clicks Production Drug dropdown")
    public void userClicksDrugMapDropdown1() throws InterruptedException {
        importWizerdMapImportedPage.userselectMapDropdown1();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("select {string} from drug dropdown")
    public void selectDrugProducName(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        importWizerdMapImportedPage.selectBtnProductDragName();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("user clicks NDC from Drug dropdown")
    public void userClicksDrugMapDropdown2() throws InterruptedException {
        importWizerdMapImportedPage.userselectMapDropdown2();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("select {string} NDC from drug dropdown")
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

//    @Then("user select unit usage radio button")
//    public void userSelectUnitUsageRadioButton() throws InterruptedException {
//        importWizerdMapImportedPage.btnRadioUnitUsage();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("user select number of order radio button")
//    public void userSelectNumberOfOrderRadioButton() throws InterruptedException {
//        importWizerdMapImportedPage.btnRadioUnitUsage();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
    @Then("user click next button")
    public void userClicksNextButton() throws InterruptedException {
        importWizerdMapImportedPage.userclickedNextButton();
        smartWait.waitUntilPageIsLoaded(10);
    }
    @Then("user should select device type dropdown")
    public void userShouldSelectDeviceType() throws InterruptedException {
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

//    @Then("user select unit of age radio button")
//    public void userSelectUnitOfAgeRadioButton() throws InterruptedException {
//        importWizerdMapImportedPage.btnRadioUnitAge();
//        smartWait.waitUntilPageIsLoaded(15);
//    }

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
        smartWait.waitUntilPageIsLoaded(60);
    }
}
