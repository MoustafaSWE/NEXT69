package session_03.firstAutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirstAutomationScript {

    public static void main(String[] args) throws InterruptedException {

        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");  // Search value -> incognito

        driver = new ChromeDriver(options);

        // Open browser and navigate to google
        driver.get("https://www.google.com.eg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Thread.sleep(20000);

        driver.quit();

    }


}
