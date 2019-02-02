package com.cybertek.tests;

import com.cybertek.pages.UserStory_5;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class UserStory_5_Test {
    public UserStory_5 userStory_5;

    @Test
    public void searchingName(){
        userStory_5=new UserStory_5();


        BrowserUtils.wait(3);
        userStory_5.searchBox.sendKeys("Agrolait" + Keys.ENTER);
        BrowserUtils.wait(3);

        userStory_5.clickOnName.click();
        BrowserUtils.wait(3);



    }
}
