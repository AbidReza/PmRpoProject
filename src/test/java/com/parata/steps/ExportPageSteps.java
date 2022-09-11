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
    ImplementationMPageSteps  implementationMPageStep;
    ImportWizerdMapImportedSteps importWizardMapSteps;
    ImportWizerdMapImportedPage importWizerdMapImportedPage;

    SmartWait smartWait = new SmartWait();

    public ExportPageSteps(TestContext context) {
        testContext = context;
    }


    @Then("click highest usage drugs button")
    public void clickHighestUsageDrugButton() throws InterruptedException{
        exportPage.userClickedHighestUsageDrugButton();
        smartWait.waitUntilPageIsLoaded(15);
    }


    @Then("click confirm button")
    public void clickedConfirmButton() throws InterruptedException{
        exportPage.userClickedConfirmButton();
        smartWait.waitUntilPageIsLoaded(15);
    }




    @Then("select {string} option")
    public void selectSubDeviceOption(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        exportPage.userSelectCallLocationDropDownOption();
        smartWait.waitUntilPageIsLoaded(15);
    }














}
