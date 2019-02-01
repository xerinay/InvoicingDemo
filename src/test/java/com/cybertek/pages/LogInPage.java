package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public @FindBy(xpath = "//a[contains(text(),'BriteErpDemo')]")
    WebElement DemoSelector;

    public @FindBy(id = "login")
    WebElement userName;

    public @FindBy(id = "password")
    WebElement passWord;

    public @FindBy(xpath = "//b[contains(text(),'Sign in')]")
    WebElement signinBtn;

    public @FindBy(xpath = "//button[@type='submit']")
    WebElement logInBtn;


    public void login() {

        signinBtn.click();
        userName.sendKeys(ConfigurationReader.getProperty("username"));
        passWord.sendKeys(ConfigurationReader.getProperty("password"));
        logInBtn.click();

    }

    public void open() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        DemoSelector.click();
    }
}
