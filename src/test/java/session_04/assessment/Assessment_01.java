package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_01 {

    /*
        TestCase:
            1. Go to URL: https://www.cazoo.co.uk/
            2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "Audi A1 1.4 TFSI S line Sportback S Tronic"
     */

    public static void main(String[] args) throws Exception{
        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        // Open browser and navigate to google
        driver.navigate().to("https://www.cazoo.co.uk/");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("div[class=\"cky-notice-btn-wrapper\"] button[class=\"cky-btn cky-btn-accept\"]"))).click();

        Thread.sleep(5000);

        driver.quit();
    }
}