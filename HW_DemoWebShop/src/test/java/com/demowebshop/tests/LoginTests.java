package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    private void loginPositiveTest(){
        driver.findElement(By.cssSelector(".ico-login")).click();

        driver.findElement(By.name("Email")).sendKeys("Ludmilla1168@mail.de");
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.cssSelector("[value='Log in']")).click();
    }


}
