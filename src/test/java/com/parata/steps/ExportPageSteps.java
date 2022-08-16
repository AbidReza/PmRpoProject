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

    @Then("click not available tab")
    public void clickNotAvailabletab() throws InterruptedException{
        exportPage.userclickedNotAvailableTab();
        smartWait.waitUntilPageIsLoaded(15);
    }
    @Then("click Excluded tab")
    public void clickExcludedtab() throws InterruptedException{
        exportPage.userclickedExcludedTab();
        smartWait.waitUntilPageIsLoaded(15);
    }
    @Then("click not oral solid tab")
    public void clickNotOralSolidtab() throws InterruptedException{
        exportPage.userclickedNotOralSolid();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click analysis tab")
    public void clickAnalysistab() throws InterruptedException{
        exportPage.userClickedAnalysis();
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

    @Then("user checked drug name form list")
    public void checkDrugNameList() throws InterruptedException{
        exportPage.userCheckDrugList();
        smartWait.waitUntilPageIsLoaded(20);
    }

    @Then("click add button")
    public void clickedAddButton() throws InterruptedException{
        exportPage.userClickedBtnAdd();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click gnc button for export")
    public void clickGncButtonForExport() throws InterruptedException{
        exportPage.userClickedGcnLink();
        smartWait.waitUntilPageIsLoaded(15);
    }

    @Then("click export button")
    public void clickExportButton() throws InterruptedException{
        exportPage.userClickedBtnExport();
        smartWait.waitUntilPageIsLoaded(15);
    }
}
