package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Assessment_01 {

    /*
    Wait Methods:
    1) Thread.sleep mili Seconds
    2) Implicit Wait -> one time, Wait global all elements DOM  **
    3) Explicit Wait -> Exceptional condition -> Wait until specific condition
    4) Fluent Wait

    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user  -- Test Data
        3. Enter Valid Password: secret_sauce -- Test Data
        4. Click On Login
     */

    public static void main(String[] args) {
        // init WebDriver
        WebDriver driver;

        // config
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        // init chrome driver
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.saucedemo.com/v1/");

        // driver -> current URL
        String url = driver.getCurrentUrl(); // url -> data type String

        // print current URl
        System.out.println("URL is: " + url);

        // 2. Enter Valid username: standard_user  -- Test Data
        String userNameValue = driver.findElement(By.id("user-name")).getAttribute("type");

        System.out.println("type=\""+userNameValue+"\""); // type="value"

        String loginButtonColor = driver.findElement(By.id("login-button")).getCssValue("background-color");

        System.out.println("Login Button Color is: " + loginButtonColor);


    }
}
