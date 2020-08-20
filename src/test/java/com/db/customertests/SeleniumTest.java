package com.db.customertests;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
public class SeleniumTest {


    @Test
    @Ignore
    public void testTitleOfVinsys() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        String expected = "Training & Certification Courses - Professional & Corporate";
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate();
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("elon musk");
        driver.findElement(By.name("btnK")).click();
        assert ("elon musk - Google Search".equals(driver.getTitle()));
    }
}
