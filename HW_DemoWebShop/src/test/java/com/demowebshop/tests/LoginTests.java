package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest(){

        app.getUser().login();

        Assert.assertTrue(app.getUser().isLoggedIn());
    }
}