package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_1 {

    public UserStory_1() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement searchMagnificationBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filterBtn;


}
