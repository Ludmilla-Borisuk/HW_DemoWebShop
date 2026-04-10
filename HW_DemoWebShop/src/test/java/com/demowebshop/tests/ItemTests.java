package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        app.getUser().login();
    }

    @Test
    public void addItemToCartTest(){

        app.getItem().addSecondItemToCart();
        app.getItem().openCart();

        Assert.assertTrue(app.getItem().isItemInCart());
    }
}