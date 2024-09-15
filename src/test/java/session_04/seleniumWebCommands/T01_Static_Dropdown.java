package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class T01_Static_Dropdown {

    //    https://the-internet.herokuapp.com/dropdown
    //    Static dropdown list:	dropdowns having tagName "Select"
    //    Dynamic dropdown list:	dropdowns having different tagName other than "Select"
    //    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose


    public static void main(String[] args) throws Exception{
        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");  // Search value -> incognito

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open browser and navigate to google
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // select from dropdown menu
        Select select = new Select(driver.findElement(By.cssSelector("select[id=\"dropdown\"]")));

        select.selectByValue("2");

        Thread.sleep(3000);

        select.selectByVisibleText("Option 1");

        Thread.sleep(3000);

        select.selectByIndex(2);

        Thread.sleep(3000);

        driver.quit();

    }

}



