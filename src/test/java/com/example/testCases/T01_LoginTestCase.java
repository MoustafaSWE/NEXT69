package com.example.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T01_LoginTestCase {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
 /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter invalid password: standard_user
        4. Click on Login button
    Expected Result:
        1. Assert that this error message is displayed: "Username and password do not match any user in this service"
        2. Assert that logo displayed beside error message, it's color match Hex Color: #ff0000
        3. Assert that you are not on this URL: https://www.saucedemo.com/v1/inventory.html
     */

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1. Open URL: https://www.saucedemo.com/v1/
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }

    @AfterMethod
    public void tearDown () {
        driver.quit();
    }

    @Test
    public void testCase01 (){
        //2. Enter Valid username: standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //3. Enter invalid password: standard_user
        driver.findElement(By.id("password")).sendKeys("standard_user");
        //4. Click on Login button
        driver.findElement(By.id("login-button")).click();  // method -> Click
        //1. Assert that this error message is displayed: "Username and password do not match any user in this service"
        String actualText = driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();
        String expectedText = "Username and password do not match any user in this service";
        softAssert.assertEquals(actualText,expectedText,"Error message does not meet '" + expectedText + "'");
        //2. Assert that logo displayed beside error message, it's color match Hex Color: #ff0000
        String actualRGBColor = driver.findElement(By.className("error-button")).getCssValue("color");
        String actualHexColor = Color.fromString(actualRGBColor).asHex();
        String expectedHexColor = "#ff0000";
        softAssert.assertEquals(actualHexColor,expectedHexColor,"Logo displayed color does not match expected: "+ expectedHexColor);
        //3. Assert that you are not on this URL: https://www.saucedemo.com/v1/inventory.html
        String actualURl = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/v1/inventory.html";
        softAssert.assertFalse(actualURl.equals(expectedURL),"user navigated to url: " + actualURl);
        softAssert.assertAll();
    }
}
