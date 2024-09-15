package session_03.firstAutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirstAutomationScript {

    /*
                    <a href="/abtest">A/B Testing</a>

        cssSelector

         tag + [ attribute ]  -- attribute -> Key = " value "
            a[href="/abtest"]

        xpath relative
       // + tag + [ @ + attribute ]  -- attribute -> Key = " value "
            //a[@href="/abtest"]
     */


    public static void main(String[] args) throws InterruptedException {

        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");  // Search value -> incognito

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open browser and navigate to google
        driver.get("https://the-internet.herokuapp.com/");

        // Navigate to A/B Testing
        driver.findElement(By.cssSelector("a[href=\"/abtest\"]")).click();

        // Print Test which is displayed to you
        String text = driver.findElement(By.className("example")).getText();

        System.out.println(text);

        boolean condition = text.contains("Functionality "); // true

        System.out.println( condition);
    }

}
