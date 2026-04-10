package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        login();
    }

    private void login() {
        driver.findElement(By.cssSelector(".ico-login")).click();

        driver.findElement(By.name("Email")).sendKeys("Ludmilla1168@mail.de");
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.cssSelector("[value='Log in']")).click();
    }

    @Test
    public void addItemToCartTest() {

        // 1. кликнуть на кнопку второго товара Add to cart
        driver.findElements(By.cssSelector(".product-box-add-to-cart-button")).get(1).click();

        // 2. кликнуть на Shopping cart
        driver.findElement(By.cssSelector(".ico-cart")).click();

        // 3. проверить товар в корзине
        Assert.assertTrue(isElementPresent(By.cssSelector(".product-name")));
    }
}

