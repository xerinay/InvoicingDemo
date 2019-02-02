package com.cybertek.tests;

import com.cybertek.pages.UserStory_5;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class UserStory_5_Test extends TestBase {
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

    @Test
    public void test2() {
        userStory_5=new UserStory_5();
        userStory_5.searchBox.sendKeys("0001"+Keys.ENTER);
    }
}
