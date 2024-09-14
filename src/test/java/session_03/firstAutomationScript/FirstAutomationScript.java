package session_03.firstAutomationScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstAutomationScript {

    public static void main(String[] args) throws InterruptedException {
        // init chrome
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver= new ChromeDriver(options);
        //driver = new FirefoxDriver();

        // open chrome and navigate to google
        driver.navigate().to("https://www.google.com/");
        //driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.quit();
    }


}
