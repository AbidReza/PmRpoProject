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


/**
 * @author Abid
 * 08/08/2022
 */
public class ImplementationMPageSteps extends AutomationBase {
    ImplementationMPage implementationMPage = new ImplementationMPage(openDriver());
    SmartWait smartWait = new SmartWait();


    public ImplementationMPageSteps(TestContext context) {
        testContext = context;
    }

    @Then("user will land {string} page")
    public void userWillLandPage(String url_part) {
        implementationMPage.implementaionMgmtClicked();
        String landingUrl = openDriver().getCurrentUrl();
        System.out.println(landingUrl);
        Assert.assertTrue(landingUrl.contains(url_part));
        smartWait.waitUntilPageIsLoaded(15);
    }

    @When("user clicks Project Status dropdown")
    public void userClicksAllRolesDropdown() throws InterruptedException {
         implementationMPage.userclickedAllStatus();
         smartWait.waitUntilPageIsLoaded(15);
         System.out.println("Open dropdown list of project status");
    }

    @And("select {string} project status for customer list")
    public void selectRole(String arg0) throws InterruptedException {
        Utility.dropdownCount(openDriver(), ".mat-option>span");
        implementationMPage.selectBtnImplementationManager();
        smartWait.waitUntilPageIsLoaded(15);
        System.out.println("Select  Not processed project status");
    }


}


