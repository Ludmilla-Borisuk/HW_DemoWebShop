package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

    protected WebDriver driver;

    public BaseHelper(WebDriver driver){
        this.driver = driver;
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }
}