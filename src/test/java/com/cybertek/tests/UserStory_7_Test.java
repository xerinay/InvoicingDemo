package com.cybertek.tests;


import com.cybertek.pages.UserStory_7;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_7_Test extends TestBase {



    public UserStory_7 userStory_1;
    UserStory_7 userStory7;

    @Test
    public void ShouldDisplay() {

        userStory7 = new UserStory_7();

        if (userStory7.customer1.isDisplayed()) {
            userStory7.customer1.click();
        }
        Assert.assertTrue(userStory7.PrintBar.isDisplayed());
        Assert.assertTrue(userStory7.ActionBar.isDisplayed());

    }

}
