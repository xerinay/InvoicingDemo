package com.cybertek.utilities;

import com.cybertek.pages.UserStory_1;
import com.cybertek.pages.loginPages.HomePage;
import com.cybertek.pages.loginPages.LogInPage;

public class Constance {

    public static void loginToInvoicingModule() {


        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        homePage.invoicing();
        homePage.invoicing();
        homePage.invoicing();

        UserStory_1 userStory_1 = new UserStory_1();

        BrowserUtils.fluentWait(userStory_1.customer_Invoices_btn, 20);
        userStory_1.customer_Invoices_btn.click();
        userStory_1.customer_Invoices_btn.click();
        userStory_1.customer_Invoices_btn.click();


    }
}
