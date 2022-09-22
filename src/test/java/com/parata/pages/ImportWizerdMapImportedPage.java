package com.parata.pages;

import com.parata.utils.CommonPageMethods;
import com.parata.utils.SmartWait;
import com.parata.utils.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ImportWizerdMapImportedPage extends CommonPageMethods{


    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-im-tool/app-pm-customer-management/app-card/div/div[2]/section/div[2]/table[1]/tbody/tr[1]/td[9]/button"))
    public WebElement btnImport;

    @FindBy(how = How.ID, using = ("fileDropRef"))
    public WebElement btnBrowse;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/div/div/div[2]/button"))
    public WebElement btnUpload;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"OrgChoosen\"]"))
    public WebElement getRemoveButton;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-select-6\"]"))
    public WebElement dropdownDrugName;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-option-12\"]"))
    public WebElement btnProductName;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-select-8\"]"))
    public WebElement dropdownDrugName2;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-option-18\"]"))
    public WebElement btnNdcName;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-select-10\"]"))
    public WebElement dropdownDrugName3;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-option-24\"]"))
    public WebElement btnRxName;

    //--
    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-checkbox-1\"]/label/span[1]"))
    public WebElement chkNoUsage;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/mat-dialog-actions/button[3]"))
    public WebElement btnNext;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-select-16\"]"))
    public WebElement dropdownDeviceType;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[4]/div/div/div/mat-option[3]"))
    public WebElement btnOption1;

    @FindBy(how = How.ID, using = ("mat-radio-2"))
    public WebElement btnRadioStandrad;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[1]/div/mat-checkbox/label/span[1]"))
    public WebElement btnChkExcludeDrug;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-checkbox-2\"]/label/span[1]"))
    public WebElement btnChkExcludeSchedule;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-checkbox-4\"]/label/span[1]"))
    public WebElement btnChkExcludeSchedule1;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-checkbox-4\"]/label/span[1]"))
    public WebElement importWizardDocPage;


    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[2]/div[3]/div[1]/mat-checkbox/label/span[1]"))
    public WebElement btnChkExcludeSchedule2;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[4]/div[1]/mat-checkbox/label/span[1]"))
    public WebElement btnChkExcludeUsage;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[2]/div[3]/div[2]/mat-checkbox[1]/label/span[1]"))
    public WebElement btnChkAntioplastic;

    @FindBy(how=How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[1]/button"))
    public WebElement btnAnalyze;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[2]/mat-form-field/div/div[1]/div/mat-select"))
    public WebElement dropdownSubDevice;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[4]/div/div/div/mat-option[1]"))
    public WebElement btnFullMainFold;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[7]/div[1]/mat-form-field/div/div[1]/div/mat-select"))
    public WebElement dropdownDayOfUse;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[4]/div/div/div/mat-option[7]"))
    public WebElement btnDayOfUse;

    @FindBy(how=How.XPATH, using = ("//*[@id=\"import\"]"))
    public WebElement btnWizardImport;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"addnewsite\"]/div/div[1]"))
    public WebElement importWizardDoc;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[1]/div/div/div[4]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span/span"))
    public WebElement ndcShortedMessage;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-dialog-0\"]/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[2]/h5"))
    public WebElement cellRecommendation;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"search_customers\"]"))
    public WebElement exportWizardPage;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container"))
    public WebElement dulicateNdcChkh;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"matTable\"]/thead/tr/th[5]/div/div[1]"))
    public WebElement cellAnalysisList;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container"))
    public WebElement exportWizardPageDuplicateNDC;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/header/app-header/mat-toolbar/div[2]/div/div/mat-card-actions/button"))
    public WebElement loginButton;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-dialog-0\"]/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[6]/div[1]/input"))
    public WebElement inputMinimumDays;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-dialog-0\"]/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[6]/div[2]/input"))
    public WebElement highCapDrawer;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-dialog-0\"]/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[6]/div[3]/input"))
    public WebElement smartDrawer;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-dialog-0\"]/app-import-wizard/div/div/form/div/mat-dialog-content/div[3]/div[6]/div[4]/input"))
    public WebElement inputDaysOfUse;




    WebDriver webDriver;

    public ImportWizerdMapImportedPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void userclickedImportButton() throws InterruptedException {
        click(btnImport);
    }

    public void userclickedBrowseButton() throws InterruptedException {
        btnBrowse.sendKeys("E:\\Kroger_025-644_03-21-2022.xlsx");
    }

    public void userclickedUploadButton() throws InterruptedException {
        click(btnUpload);
    }


    public Boolean userSeeSuccessfullyMessage() throws InterruptedException {
        return getRemoveButton.isDisplayed();
    }

    public void userselectMapDropdown1() throws InterruptedException {
        click(dropdownDrugName);
    }

    public void selectBtnProductDragName() throws InterruptedException {
        click(btnProductName);
    }

    public void userselectMapDropdown2() throws InterruptedException {
        click(dropdownDrugName2);
    }

    public void selectBtnNdcDragName() throws InterruptedException {
        click(btnNdcName);
    }

    public void userselectMapDropdown3() throws InterruptedException {
        click(dropdownDrugName3);
    }

    public void selectBtnRxDragName() throws InterruptedException {
        click(btnRxName);
    }

    public void selectChkNOUsage() throws InterruptedException {
        click(chkNoUsage);
    }


    public void userclickedNextButton() throws InterruptedException {
        click(btnNext);
    }

    public void selectDeviceType() throws InterruptedException {
        click(dropdownDeviceType);
    }

    public void selectOption1() throws InterruptedException {
        click(btnOption1);
    }

    public void btnRadioStandrad() throws InterruptedException {
        click(btnRadioStandrad);
    }

    public void chkExcludeDrug() throws InterruptedException {
        click(btnChkExcludeDrug);
    }

    public void chkExcludeSchedule() throws InterruptedException {
        click(btnChkExcludeSchedule);
    }


    public void chkExcludeSchedule1 () throws InterruptedException {
        click(btnChkExcludeSchedule1);
    }

    public void chkExcludeDrug2() throws InterruptedException {
        click(btnChkExcludeSchedule2);
    }

    public void chkExcludeUsage() throws InterruptedException {
        click(btnChkExcludeUsage);
    }

    public void chkAntineoPlastic() throws InterruptedException {
        click(btnChkAntioplastic);
    }

    public void userclickedAnalyzeButton() throws InterruptedException {
        click(btnAnalyze);
    }

    public void selectSubDeviceType() throws InterruptedException {
        click(dropdownSubDevice);
    }

    public void selectSubDeviceOption() throws InterruptedException {
        click(btnFullMainFold);
    }

    public void selectDayOfUseDropDown() throws InterruptedException {
        click(dropdownDayOfUse);
    }

    public void selectDayOfUseOption() throws InterruptedException {
        click(btnDayOfUse);
    }

    public void userclickedWizardImportButton() throws InterruptedException {
        click(btnWizardImport);
    }

    public String isImportWizardDocPage() throws InterruptedException {
        return importWizardDoc.getText();
    }

    public String isDuplicateNDCSorted() throws InterruptedException {
        return ndcShortedMessage.getText();
    }

    public String isCellRecommendation() throws InterruptedException {
        return cellRecommendation.getText();
    }

    public String isAnalysisCellList() throws InterruptedException {
        return cellAnalysisList.getText();
    }

    public Boolean isImportWizardDocPageAvailable() {
        return importWizardDocPage.isDisplayed();
    }

    public Boolean isExportWizardPageAvailable() {
        return exportWizardPage.isDisplayed();
    }

    public String isLoginButton() throws InterruptedException {
        return loginButton.getText();
    }

    public Boolean isExportWizardDuplicateNDcChk() {
        return dulicateNdcChkh.isDisplayed();
    }


    public void inputMinimumDays(String days) {
        inputMinimumDays.clear();
        inputMinimumDays.sendKeys(days);
    }
    public void inputHighCapDrawer(String hdrawer) {
        highCapDrawer.clear();
        highCapDrawer.sendKeys(hdrawer);
    }

    public void inputSmartDrawer(String sdrawer) {
        smartDrawer.clear();
        smartDrawer.sendKeys(sdrawer);
    }
    public void inputDaysUse(String daysuse) {
        inputDaysOfUse.clear();
        inputDaysOfUse.sendKeys(daysuse);
    }
}
