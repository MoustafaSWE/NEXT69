package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assessment_01 {

    /*
        TestCase:
            1. Go to URL: https://www.cazoo.co.uk/
            2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "2022 1.0l 5dr"
     */

    public static void main(String[] args) throws Exception{
        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        // 1. Go to URL: https://www.cazoo.co.uk/
        driver.navigate().to("https://www.cazoo.co.uk/");

        // 2. Wait and Click on Accept all Cookies
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("div[class=\"cky-notice-btn-wrapper\"] button[class=\"cky-btn cky-btn-accept\"]"))).click();

        // 3. Choose make Audi
        driver.findElement(By.cssSelector("div[class=\"motors-widget-full-width-filter-meta-container\"]")).click();

        Select select = new Select(driver.findElement(By.name("Make")));
        select.selectByValue("Audi");

        // 4. Choose model A1
        Select select1 = new Select(driver.findElement(By.name("Model")));
        select1.selectByValue("A1");

        // Missing Steps
        driver.findElement(By.cssSelector("div[class=\"motors-widget-full-width-search-miniwidget\"] div[class=\"motors-widget-full-width-filter-meta-btn\"]")).click();

        // 5. Print all result fount
        //wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("div[class=\"motors-widget-car-element-meta\"]"))));
        Thread.sleep(3000);
        List<WebElement> listOfCars = driver.findElements(By.cssSelector("div[class=\"motors-widget-car-element-meta-left-details\"]"));
       // List<WebElement> listOfCars = driver.findElements(By.cssSelector("div[class=\"motors-widget-car-element-meta\"]"));

        for (int i = 1 ; i < listOfCars.size() ; i++){

            System.out.println(listOfCars.get(i).getText());
        }
    }
}