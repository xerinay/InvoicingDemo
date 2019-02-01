package com.cybertek.tests;

import com.cybertek.pages.LogInPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class Testing extends TestBase {

    @Test(groups = "regression")
    public void testName() {

        pages.logIn().open();
        pages.logIn().login();

    }
}
