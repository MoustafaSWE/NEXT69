package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_02 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Invalid username: standard
        3. Enter Invalid Password: secret
        4. Click On Login
     */

    public static void main(String[] args) throws InterruptedException {

        // init chrome
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();

        driver= new ChromeDriver(options);

        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-button\"]")));

        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        button.click();


        Thread.sleep(2000);
        driver.quit();

    }
}
