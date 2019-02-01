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

    @FindBy(xpath = "//a[contains(text(),'BriteErpDemo')]")
    public WebElement DemoSelector;

    @FindBy(id = "login")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(xpath = "//b[contains(text(),'Sign in')]")
    public WebElement signinBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBtn;

    public void login(){

        signinBtn.click();
        this.userName.sendKeys(ConfigurationReader.getProperty("username"));
        this.passWord.sendKeys(ConfigurationReader.getProperty("password"));
        logInBtn.click();

    }

    public void open(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        DemoSelector.click();
    }
}
