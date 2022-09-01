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

public class ExportPage extends CommonPageMethods{

    @FindBy(how = How.ID, using = ("mat-tab-label-1-1"))
    public WebElement tabNotAvailableTab;

    @FindBy(how = How.ID, using = ("mat-tab-label-1-2"))
    public WebElement tabExcluded;

    @FindBy(how = How.ID, using = ("mat-tab-label-1-3"))
    public WebElement tabNotOralSolid;

    @FindBy(how = How.ID, using = ("mat-tab-label-1-4"))
    public WebElement tabCellLocator;

    @FindBy(how = How.ID, using = ("mat-tab-label-1-0"))
    public WebElement tabAnalysis;

    @FindBy(how=How.XPATH, using=("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[1]/div/div[2]/span"))
    public  WebElement btnGcn;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[3]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug3;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[5]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug5;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[7]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug7;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[9]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug9;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[14]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug14;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[20]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug20;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[22]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug22;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[24]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug24;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[26]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug26;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[28]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug28;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[31]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug31;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[33]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug33;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[36]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug36;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[38]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug38;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[40]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug40;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[42]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug42;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[46]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug46;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[60]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug60;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[62]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug62;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[65]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug65;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[67]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug67;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[69]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug69;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[71]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug71;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[73]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug73;

    @FindBy(how = How.ID,using =("Confirm"))
    public WebElement btnConfirm;

    @FindBy(how = How.XPATH,using =("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[1]/div/div[1]/div[1]/button[2]"))
    public WebElement btnCddb;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-cddb/div/div/mat-dialog-content/div[1]/div/div/input"))
    public WebElement searchDrugInput;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-cddb/div/mat-dialog-actions/div[1]/mat-paginator/div/div/div[2]/button[2]/span[1]"))
    public WebElement btnPagination;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-cddb/div/div/mat-dialog-content/div[2]/table[1]/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrugListName1;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-cddb/div/div/mat-dialog-content/div[1]/button"))
    public WebElement btnAddToDrugList;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-cddb/div/mat-dialog-actions/div[2]/button"))
    public WebElement btnOk;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/table[1]/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrugName;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"remove_celllocation\"]"))
    public WebElement btnRemove;

    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-alert-wizard/mat-dialog-actions/button[2]"))
    public WebElement btnRemoveConfirm;

    @FindBy(how = How.XPATH, using = ("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/table[1]/tbody/tr[1]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrugNameAgain;

    @FindBy(how = How.XPATH, using = ("//*[@id=\"mat-select-458\"]"))
    public WebElement dropdownCellLocation;

    @FindBy(how = How.XPATH, using = ("////*[@id=\"mat-option-4\"]"))
    public WebElement selectDropdownOption;


    @FindBy(how = How.XPATH, using = ("//*[@id=\"matTable\"]/thead/tr/th[23]/mat-icon/img"))
    public WebElement btnPenOption;

//    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/mat-dialog-actions/button[3]"))
//    public WebElement btnExport;
//
//    @FindBy(how = How.XPATH, using = ("/html/body/div[3]/div[4]/div/mat-dialog-container/app-alert-wizard/mat-dialog-actions/button[2]"))
//    public WebElement btnConfirmExport;

    WebDriver webDriver;

    public ExportPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void userclickedAllTab() throws InterruptedException {
        click(tabNotAvailableTab);
        click(tabExcluded);
        click(tabNotOralSolid);
        click(tabCellLocator);
        click(tabAnalysis);
    }

    public void userClickedGcnLink()throws InterruptedException{
        click(btnGcn);
    }
    public void userCheckedDuplicate()throws  InterruptedException{
        click(chkDrug3);
        click(chkDrug5);
        click(chkDrug7);
        click(chkDrug9);
        click(chkDrug14);
        click(chkDrug20);
        click(chkDrug22);
        click(chkDrug24);
        click(chkDrug26);
        click(chkDrug28);
        click(chkDrug31);
        click(chkDrug33);
        click(chkDrug36);
        click(chkDrug38);
        click(chkDrug40);
        click(chkDrug42);
        click(chkDrug46);
        click(chkDrug60);
        click(chkDrug62);
        click(chkDrug65);
        click(chkDrug67);
        click(chkDrug69);
        click(chkDrug71);
        click(chkDrug73);
    }
    public void userClickedConfirmButton()throws  InterruptedException{
        click(btnConfirm);
    }

    public void userClickedCddbButton()throws  InterruptedException{
        click(btnCddb);
    }

    public void enterSearchDrugName(String drugName) {
        searchDrugInput.sendKeys(drugName);
    }

    public void clickPagination()throws  InterruptedException {
        click(btnPagination);

    }

    public void userCheckDrugList()throws  InterruptedException {
        click(chkDrugListName1);

    }

    public void userClickedBtnAdd()throws  InterruptedException{
        click(btnAddToDrugList);
    }

    public void userClickedBtnOk()throws  InterruptedException{
        click(btnOk);
    }

    public void userCheckedDrugName()throws  InterruptedException {
        click(chkDrugName);
    }

    public void userClickedBtnRemove()throws  InterruptedException{
        click(btnRemove);
    }

    public void userClickedBtnRemoveConfirm()throws  InterruptedException{
        click(btnRemoveConfirm);
    }

    public void userCheckedDrugNameAgain()throws  InterruptedException{
        click(chkDrugNameAgain);
    }

    public void userSelectCellLocationDropdown() throws InterruptedException {
        click(dropdownCellLocation);
    }

    public void userSelectCallLocationDropDownOption() throws InterruptedException {
        click(selectDropdownOption);
    }

    public void userClickedBtnPenOption()throws  InterruptedException{
        click(btnPenOption);
    }

//    public void userClickedBtnExport()throws  InterruptedException{
//        click(btnExport);
//    }
//
//    public void userClickedBtnExportConfirm()throws  InterruptedException{
//        click(btnConfirmExport);
//    }

}
