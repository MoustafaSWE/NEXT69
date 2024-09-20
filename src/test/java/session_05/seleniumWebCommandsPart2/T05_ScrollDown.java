package session_05.seleniumWebCommandsPart2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T05_ScrollDown {

    /*

     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/div/div/div/div[2]/a/div[2]"));

        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
