package com.demowebshop.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isHomeComponentPresent(){
        return driver.findElements(By.xpath("//div[@class='header-logo']//a")).size()>0;
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();

    }

    public void type(int i) {
        driver.findElement(By.name("FirstName")).sendKeys("Ludmilla");
        driver.findElement(By.name("LastName")).sendKeys("Borisuk");
        driver.findElement(By.name("Email")).sendKeys("Ludmilla" + i + "@mail.de");
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Aa12345!");
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type() {
        driver.findElement(By.name("FirstName")).sendKeys("Ludmilla");
        driver.findElement(By.name("LastName")).sendKeys("Borisuk");
        driver.findElement(By.name("Email")).sendKeys("Ludmilla1168@mail.de");
        driver.findElement(By.name("Password")).sendKeys("Aa12345!");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Aa12345!");
    }
}
