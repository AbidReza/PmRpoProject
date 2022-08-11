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

    @FindBy(how = How.XPATH, using = ("//*[@id=\"D-MnuImTool\"]/a"))
    public WebElement btnImplementationMgt;



    WebDriver webDriver;

    public ExportPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

}
