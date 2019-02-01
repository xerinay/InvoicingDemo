package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LogInPage;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test(groups = "regression")
    public void testName() {

        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        homePage.invoicingBtn.click();

    }
}
