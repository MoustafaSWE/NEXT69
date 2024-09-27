package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {
    WebDriver driver;

    // Constructor
    public P01_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elements
    By loginButtonLocator = By.id("login-button");

    // Actions
    public void clickOnLoginButton (){
        driver.findElement(loginButtonLocator).click();
    }
}
