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

    @When("user will land the {string} page")
    public void userWillLandExportPage(String url_part) {
        String landingUrl = openDriver().getCurrentUrl();
        System.out.println(landingUrl);
        Assert.assertTrue(landingUrl.contains(url_part));
        smartWait.waitUntilPageIsLoaded(50);
    }
}
