package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T03_JSAlert {

    public static void main(String[] args) throws Exception {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        // first prompt
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();

        Thread.sleep(3000);

//        String mostafa =  driver.switchTo().alert().getText();
//
//        System.out.println(mostafa);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent()).sendKeys("Moustafa");
        driver.switchTo().alert().accept();

        Thread.sleep(3000);
    }
}
