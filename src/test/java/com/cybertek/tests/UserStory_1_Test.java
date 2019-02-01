package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LogInPage;
import com.cybertek.pages.UserStory_1;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserStory_1_Test extends TestBase {

    @Test
    public void filter_1() {
        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        BrowserUtils.waitForClickablility(By.xpath("//span[@class='oe_menu_text'][contains(text(),'Invoicing')]"), 10);
        homePage.invoicingBtn.click();

        UserStory_1 userStory_1 = new UserStory_1();

        userStory_1.searchMagnificationBtn.click();
        userStory_1.filterBtn.click();

        BrowserUtils.wait(5);

    }
}
