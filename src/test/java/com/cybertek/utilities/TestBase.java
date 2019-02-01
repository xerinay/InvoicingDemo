package com.cybertek.utilities;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;


    @BeforeMethod
    public void setUpMethod() {

        driver = Driver.getDriver(); //using this no one can create object
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        actions = new Actions(driver);
        softAssert = new SoftAssert();

        /*LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        BrowserUtils.waitForClickablility(By.xpath("//span[@class='oe_menu_text'][contains(text(),'Invoicing')]"), 10);
        homePage.invoicingBtn.click();*/


    }

    @AfterMethod
    public void tearDownMethod() {

        Driver.closeDriver();
        softAssert.assertAll();

    }

}
