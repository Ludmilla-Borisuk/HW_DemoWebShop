package com.demowebshop.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicationManager app;

    @BeforeMethod
    public void setUp(){

        String browser = System.getProperty("browser", "chrome");

        app = new ApplicationManager(browser);
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }
}