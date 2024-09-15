package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class T03_findelements {

    //    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose

    public static void main(String[] args) {

        // init. chrome driver
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");  // Search value -> incognito

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open browser and navigate to google
        driver.get("https://www.google.com.eg/");

        driver.findElement(By.name("q")).sendKeys("Al Zamalak");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        By listOfWebElements = By.cssSelector("ul[role=\"listbox\"] li[role=\"presentation\"]"); // memory
        List<WebElement> listWebElementsWebLocators = driver.findElements(listOfWebElements);

        wait.until(ExpectedConditions.visibilityOfAllElements(
                listWebElementsWebLocators));

        listWebElementsWebLocators.get(2).click();

    }


}
