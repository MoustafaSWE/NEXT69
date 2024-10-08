package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T04_DragAndDrop {

    public static void main(String[] args) throws Exception{
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver, Duration.ofSeconds(10));
        WebElement element1 = driver.findElement(By.id("column-a"));
        WebElement element2 = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(element1,element2).perform();
    }
}
