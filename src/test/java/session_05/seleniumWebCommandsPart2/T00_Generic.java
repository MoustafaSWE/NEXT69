package session_05.seleniumWebCommandsPart2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");

        String rgpColor = driver.findElement(By.id("login-button")).getCssValue("background-color");

        System.out.println("RGP Color is: " + rgpColor);

        String hexColor = Color.fromString(rgpColor).asHex();

        System.out.println("HEX Color is: " + hexColor);


        driver.quit();
    }
}
