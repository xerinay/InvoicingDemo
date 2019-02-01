package com.cybertek.tests;

import com.cybertek.pages.UserStory_1;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class UserStory_1_Test extends TestBase {

    @Test
    public void filter_1() {
       UserStory_1 userStory_1 = new UserStory_1();
       if (userStory_1.searchMagnificationBtn.isEnabled()){
           userStory_1.searchMagnificationBtn.click();
       }

       userStory_1.filterBtn.click();

       BrowserUtils.wait(10);

       assertTrue(userStory_1.draft_btn.isDisplayed());
       assertTrue(userStory_1.open_btn.isDisplayed());
    }
}
