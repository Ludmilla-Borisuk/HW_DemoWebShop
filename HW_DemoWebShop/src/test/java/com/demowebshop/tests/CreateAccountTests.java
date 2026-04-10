package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest(){
        String email = "test" + System.currentTimeMillis() + "@mail.com";

        app.getUser().openRegistration();
        app.getUser().fillRegistrationForm(email);
        app.getUser().submitRegistration();

        Assert.assertTrue(app.getUser().isLoggedIn());
    }

    @Test
    public void existedUserRegisterNegativeTest_existingEmail(){

        app.getUser().openRegistration();
        app.getUser().fillRegistrationForm("Ludmilla1168@mail.de");
        app.getUser().submitRegistration();

        Assert.assertTrue(app.getUser().isErrorPresent());
    }
}