package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class T01_Tabs {

    public static void main(String[] args) {
        //1- Create an object from WebDriver
        WebDriver driver;

        // 2- Create new object from chromedriver
        driver = new ChromeDriver();

        // 3- Configuration
        //3.1- Maximize browser
        driver.manage().window().maximize();
        //3.2- Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 4- Navigate to website
        driver.navigate().to("https://saucelabs.com/");

        driver.findElement(By.xpath("(//a[@href=\"/request-demo\"])[1]")).sendKeys(Keys.END); // Scroll End of page

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[9]/div[1]/div[1]/div/div[5]/div/div[5]/a/div/div[1]/span")).click(); // new tab

        // Store Tabs Array List
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println("Number of tabs: " + tabs.size());

        driver.switchTo().window(tabs.get(0));

        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
