package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_7 {
    public UserStory_7() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    public WebElement customer1;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/button")
    public WebElement PrintBar;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement ActionBar;

}
