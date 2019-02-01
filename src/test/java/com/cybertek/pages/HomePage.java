package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Invoicing')]")
    WebElement invoicingBtn;



    public void invoicing(){

        invoicingBtn.click();
    }
}
