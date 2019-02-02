package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_5 {
    public UserStory_5() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[1]//td[2]")
    public WebElement clickOnName;
}
