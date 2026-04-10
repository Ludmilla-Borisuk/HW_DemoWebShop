package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTest(){
        int i = (int) ((System.currentTimeMillis()/1000)%3600);
        // 1. открыть страницу регистрации
        click(By.cssSelector("[href='/register']"));
        // 2. заполнить форму
        type(i);
        // 3. нажать Register
        click(By.id("register-button"));
        // 4. assert (проверка)
        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
    }

    @Test
    public void existedUserRegisterNegativeTest_existingEmail(){
        // 1. открыть страницу регистрации
        click(By.cssSelector("[href='/register']"));
        // 2. заполнить форму
        type();
        // 3. нажать Register
        click(By.id("register-button"));
        // 4. assert ошибки
        Assert.assertTrue(isElementPresent(By.cssSelector(".validation-summary-errors")));
    }

}
