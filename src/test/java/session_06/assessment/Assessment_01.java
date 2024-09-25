package session_06.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assessment_01 {
    WebDriver driver;
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

        driver.navigate().to("https://www.saucedemo.com/v1/");
    }

    @Test
    public void testCase01 (){
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

}
