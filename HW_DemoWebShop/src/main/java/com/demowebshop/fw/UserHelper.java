package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver){
        super(driver);
    }

    public void login(){
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("Ludmilla1168@mail.de");
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.cssSelector("[value='Log in']")).click();
    }

    public void openRegistration(){
        driver.findElement(By.cssSelector("[href='/register']")).click();
    }

    public void fillRegistrationForm(String email){
        driver.findElement(By.name("FirstName")).sendKeys("Ludmilla");
        driver.findElement(By.name("LastName")).sendKeys("Borisuk");
        driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Aa12345!");
    }

    public void submitRegistration(){
        driver.findElement(By.id("register-button")).click();
    }

    public boolean isLoggedIn(){
        return isElementPresent(By.cssSelector(".ico-logout"));
    }

    public boolean isErrorPresent(){
        return isElementPresent(By.cssSelector(".validation-summary-errors"));
    }

    public boolean isHomePage(){
        return isElementPresent(By.xpath("//div[@class='header-logo']//a"));
    }
}