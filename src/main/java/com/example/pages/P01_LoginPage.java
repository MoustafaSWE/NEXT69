package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {
    WebDriver driver;

    // Constructor


    // Elements
    By loginButtonLocator = By.id("login-button");

    // Actions
    public void clickOnLoginButton (){
        driver.findElement(loginButtonLocator).click();
    }
}
