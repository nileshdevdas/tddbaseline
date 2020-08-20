package com.db.customertests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
public class FunctionalTestCase {
    WebDriver driver;

    @Before
    public void beforeTest(){
        //let the error come and then we will set the
        // property to lcate where is the location of my Chrome Driver
        System.setProperty("webdriver.chrome.driver", "d:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void checkTheTitleOfVinsysWebsite(){
        assertNotNull(driver);
        // goto a a page
        String expectedValue = "Training & Certification Courses - Professional & Corporate";
        driver.navigate().to("https://www.vinsys.com");
        driver.manage().window().fullscreen();
        assertEquals(driver.getTitle(), (expectedValue));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/header/div/nav/div/div[2]/ul[3]/li[2]/a")).click();
        driver.manage().window().fullscreen();
        String corporateExcepted = "Corporate Training in IT, PMP & Client Relationship | Vinsys";
        assertEquals(corporateExcepted, driver.getTitle());

    }

    @After
    public void afterTest(){
        // so that any open browser which opened for testing is closed....
        driver.close();
    }
}
