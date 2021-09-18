package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }

    @Test
    public void test1() throws InterruptedException {

        WebElement nameBox = driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Ali");

        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Yilmaz");
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown(){

        driver.quit();

    }
}
