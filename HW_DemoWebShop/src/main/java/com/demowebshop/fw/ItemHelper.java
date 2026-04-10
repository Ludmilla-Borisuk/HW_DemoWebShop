package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper{

    public ItemHelper(WebDriver driver){
        super(driver);
    }

    public void addSecondItemToCart(){
        driver.findElements(By.cssSelector(".product-box-add-to-cart-button")).get(1).click();
    }

    public void openCart(){
        driver.findElement(By.cssSelector(".ico-cart")).click();
    }

    public boolean isItemInCart(){
        return isElementPresent(By.cssSelector(".product-name"));
    }
}