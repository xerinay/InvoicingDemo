package com.cybertek.utilities;

import com.cybertek.pages.LogInPage;

public class Pages {

    private LogInPage logInPage;

    public LogInPage logIn() {

        if (logInPage == null) {

            logInPage = new LogInPage();
        }

        return logInPage;
    }
}
