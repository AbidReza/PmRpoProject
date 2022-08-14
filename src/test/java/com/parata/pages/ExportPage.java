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

    @FindBy(how = How.ID, using = ("mat-tab-label-0-1"))
    public WebElement tabNotAvailableTab;

    @FindBy(how = How.ID, using = ("mat-tab-label-0-2"))
    public WebElement tabExcluded;

    @FindBy(how = How.ID, using = ("mat-tab-label-0-3"))
    public WebElement tabNotOralSolid;

    @FindBy(how = How.ID, using = ("mat-tab-label-0-0"))
    public WebElement tabAnalysis;

    @FindBy(how=How.XPATH, using=("/html/body/app-root/div/ng-sidebar-container/div/div/div/mat-sidenav-container/mat-sidenav-content/div/div/app-customer-drug-list/app-card/div/div[2]/section/div[1]/div/div[2]/span"))
    public  WebElement btnGcn;

    @FindBy(how = How.ID, using = ("/html/body/div[3]/div[2]/div/mat-dialog-container/app-import-wizard-gcn/div/div/mat-dialog-content/div/table[1]/tbody/tr[12]/td[1]/mat-checkbox/label/span[1]"))
    public WebElement chkDrug1;

    @FindBy(how = How.ID,using =("Confirm"))
    public WebElement btnConfirm;



    WebDriver webDriver;

    public ExportPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void userclickedNotAvailableTab() throws InterruptedException {
        click(tabNotAvailableTab);
    }

    public void userclickedExcludedTab() throws InterruptedException {
        click(tabExcluded);
    }

    public void userclickedNotOralSolid() throws InterruptedException {
        click(tabNotOralSolid);
    }

    public void userClickedAnalysis()throws InterruptedException{
        click(tabAnalysis);
    }
    public void userClickedGcnLink()throws InterruptedException{
        click(btnGcn);
    }
public void userCheckedDuplicate1()throws  InterruptedException{
        click(chkDrug1);
}

    public void userClickedConfirmButton()throws  InterruptedException{
        click(btnConfirm);
    }

}
