package com.parata.steps;

import com.parata.base.AutomationBase;
import com.parata.pages.ExportPage;
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

public class ExportPageSteps extends AutomationBase{

    ExportPage exportPage = new ExportPage(openDriver());
    SmartWait smartWait = new SmartWait();

    @Then("user click all tabs")
    public void clickNotAvailabletab() throws InterruptedException{
        exportPage.userclickedAllTab();
        smartWait.waitUntilPageIsLoaded(15);
    }


    @Then("click gnc button")
    public void clickGncButton() throws InterruptedException{
        exportPage.userClickedGcnLink();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click check duplicate drugs")
    public void checkDuplicateDrug() throws InterruptedException{
        exportPage.userCheckedDuplicate();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click confirm button")
    public void clickedConfirmButton() throws InterruptedException{
        exportPage.userClickedConfirmButton();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click cddb button")
    public void clickedCddbButton() throws InterruptedException{
        exportPage.userClickedCddbButton();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user enters {string} drug name into the search bar")
    public void searchDrugName(String drugName) {
        exportPage.enterSearchDrugName(drugName);
        smartWait.waitUntilPageIsLoaded(20);
    }
    @Then("click pagination button")
    public void clickedPaginationButton() throws InterruptedException{
        exportPage.clickPagination();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user checked drug name form list")
    public void checkDrugNameList() throws InterruptedException{
        exportPage.userCheckDrugList();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @Then("click to add for drug list")
    public void clickedAddButton() throws InterruptedException{
        exportPage.userClickedBtnAdd();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click ok button")
    public void clickedOkButton() throws InterruptedException{
        exportPage.userClickedBtnOk();
        smartWait.waitUntilPageIsLoaded(15);
    }

//    @Then("click gnc button for export")
//    public void clickGncButtonForExport() throws InterruptedException{
//        exportPage.userClickedGcnLink();
//        smartWait.waitUntilPageIsLoaded(15);
//    }

    @Then("user checked drug name")
    public void checkDrugName() throws InterruptedException{
        exportPage.userCheckedDrugName();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @Then("user clicked remove button")
    public void userClickRemoveButton() throws InterruptedException{
        exportPage.userClickedBtnRemove();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user clicked remove confirm button")
    public void userClickRemoveConfirmButton() throws InterruptedException{
        exportPage.userClickedBtnRemoveConfirm();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user select again checked drug name")
    public void userSelectAgainCheckedDrugName() throws InterruptedException{
        exportPage.userCheckedDrugNameAgain();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @Then("user select cell location dropdown")
    public void userClickCellLocationDropdown() throws InterruptedException{
        exportPage.userSelectCellLocationDropdown();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("user select cell location option")
    public void userClickCellLocationOption() throws InterruptedException{
        exportPage.userSelectCallLocationDropDownOption();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click pen option")
    public void clickPenButton() throws InterruptedException{
        exportPage.userClickedBtnPenOption();
        smartWait.waitUntilPageIsLoaded(15);
    }


//    @Then("click export button")
//    public void clickExportButton() throws InterruptedException{
//        exportPage.userClickedBtnExport();
//        smartWait.waitUntilPageIsLoaded(15);
//    }
//
//    @Then("click export confirm button")
//    public void clickExportConfirmButton() throws InterruptedException{
//        exportPage.userClickedBtnExportConfirm();
//        smartWait.waitUntilPageIsLoaded(15);
//    }


}
